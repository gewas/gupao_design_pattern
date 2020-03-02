package com.gupao.designpattern.proxy.analysis.imitate;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/2 14:05
 */
public class MyProxy {
    public static final String LF = "\n";

    protected MyInvocationHandler h;

    public MyProxy(MyInvocationHandler h) {
        this.h = h;
    }

    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h) {
        // 1.动态生成源码
        String src = generateSrc(loader, interfaces);
        // 2.文件输出到磁盘.java文件
        String filepath = MyProxy.class.getResource("").getPath();
        File javaFile = new File(filepath + "$Proxy0.java");
        try (FileWriter fileWriter = new FileWriter(javaFile)) {
            fileWriter.write(src);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3.编译.java文件为$Proxy0.class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(javaFile);

        JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
        task.call();
        try {
            manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        javaFile.delete();

        // 4.把.class加载到jvm
        Class proxyClass;
        try {
            proxyClass = loader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);

            // 5.返回代理对象
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 这是一个很生硬的实现
     *
     * @param interfaces
     * @return
     */
    private static String generateSrc(MyClassLoader loader, Class<?>[] interfaces) {
        StringBuilder sb = new StringBuilder();

        // 1.package 语句
        sb.append("package " + loader.getClass().getPackage().getName() + ";" + LF);

        // 2.import 语句部分
        Set<String> importSet = new HashSet<>(8);
        for (Class<?> aClass : interfaces) {
            // 解析import语句，利用set去重
            importSet.add("import " + aClass.getCanonicalName() + ";" + LF);
            for (Method m : aClass.getMethods()) {
                if (!m.getReturnType().isPrimitive()) {
                    importSet.add("import " + m.getReturnType().getCanonicalName() + ";" + LF);
                }
                for (Class<?> parameterType : m.getParameterTypes()) {
                    if (!parameterType.isPrimitive()) {
                        importSet.add("import " + parameterType.getCanonicalName() + ";" + LF);
                    }
                }
            }
        }
        importSet.forEach(item -> sb.append(item));
        // 由于必定会用到反射，直接写死
        sb.append("import java.lang.reflect.*;" + LF);
        sb.append("import " + MyProxy.class.getCanonicalName() + ";" + LF);

        // 3.class部分，这里class名就写死了，因为没有写动态代理类计数机制。
        sb.append("public final class $Proxy0 extends MyProxy implements ");
        for (int i = 0; i < interfaces.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(interfaces[i].getSimpleName());
        }
        sb.append("{" + LF);
        /* class 内部开始  */
        // Fields部分
        List<Method> methods = new ArrayList<>(8);
        for (Class<?> anInterface : interfaces) {
            for (Method method : anInterface.getMethods()) {
                methods.add(method);
            }
        }
        for (int i = 0; i < methods.size(); i++) {
            sb.append("private static Method m" + i + ";" + LF);
        }

        //  静态初始化 部分
        sb.append("static{" + LF)
                .append("try {" + LF);
        for (int i = 0; i < methods.size(); i++) {
            Method m = methods.get(i);
            sb.append("m" + i + " = Class.forName(\"")
                    .append(m.getDeclaringClass().getCanonicalName())
                    .append("\").getMethod(\"")
                    .append(m.getName() + "\"");
            if (m.getParameterTypes() != null && m.getParameterTypes().length > 0) {
                sb.append(", ");
                for (int i1 = 0; i1 < m.getParameterTypes().length; i1++) {
                    Class p = m.getParameterTypes()[i1];
                    if (i1 > 0) {
                        sb.append(", ");
                    }
                    if (p.isPrimitive()) {
                        String typename = p.getTypeName().toLowerCase();
                        switch (typename) {
                            case "byte": {
                                typename = "Byte.TYPE";
                                break;
                            }
                            case "short": {
                                typename = "Short.TYPE";
                                break;
                            }
                            case "int": {
                                typename = "Integer.TYPE";
                                break;
                            }
                            case "long": {
                                typename = "Long.TYPE";
                                break;
                            }
                            case "float": {
                                typename = "Float.TYPE";
                                break;
                            }
                            case "double": {
                                typename = "Double.TYPE";
                                break;
                            }
                            case "char": {
                                typename = "Character.TYPE";
                                break;
                            }
                            case "boolean": {
                                typename = "Boolean.TYPE";
                                break;
                            }
                            default:
                        }
                        sb.append(typename);
                    } else {
                        sb.append("Class.forName(\"");
                        sb.append(p.getTypeName());
                        sb.append("\")");
                    }
                }
            }
            sb.append(");" + LF);
        }
        sb.append("} catch (Exception e) {" + LF)
                .append("e.printStackTrace();" + LF)
                .append("}" + LF)
                .append("}" + LF);

        // Constructor

        sb.append("public $Proxy0(" + MyInvocationHandler.class.getCanonicalName() + " h){" + LF)
                .append("super(h);" + LF)
                .append("}" + LF);

        // 方法实现部分
        for (int i = 0; i < methods.size(); i++) {
            Method m = methods.get(i);
            sb.append("@Override" + LF);
            sb.append("public " + m.getGenericReturnType().getTypeName());
            sb.append(" " + m.getName() + "(");
            for (int j = 0; j < m.getParameterTypes().length; j++) {
                if (j > 0) {
                    sb.append(", ");
                }
                Class paramType = m.getParameterTypes()[j];
                sb.append(paramType.getSimpleName())
                        .append(" a" + paramType.getSimpleName());
            }
            sb.append("){" + LF);
            sb.append("try {" + LF);
            if (!m.getReturnType().isPrimitive()) {
                sb.append("return (")
                        .append(m.getGenericReturnType().getTypeName())
                        .append(")");
            }
            sb.append("super.h.invoke(this, m" + i + ", ");
            if (m.getParameterTypes().length > 0) {
                sb.append("new Object[]{");
                for (int j = 0; j < m.getParameterTypes().length; j++) {
                    if (j > 0) {
                        sb.append(", ");
                    }
                    Class paramType = m.getParameterTypes()[j];
                    sb.append(" a" + paramType.getSimpleName());
                }
                sb.append("}");
            } else {
                sb.append("null");
            }
            sb.append(");" + LF);
            sb.append("} catch(Throwable th){" + LF)
                    .append("th.printStackTrace();" + LF)
                    .append("}" + LF);
            if (!m.getReturnType().isPrimitive()) {
                sb.append("return null;" + LF);
            }
            sb.append("}" + LF)
                    .append(LF);

        }
        /* class 内部结束  */
        sb.append("}" + LF);
        return sb.toString();
    }
}
