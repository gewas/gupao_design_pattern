package com.gupao.designpattern.structural.proxy.analysis.imitate;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/2 13:59
 */
public class MyClassLoader extends ClassLoader {

    private File classpathFile;

    public MyClassLoader() {
        String classpath = MyClassLoader.class.getResource("").getPath();
        this.classpathFile = new File(classpath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String classname = MyClassLoader.class.getPackage().getName() + "." + name;
        if (classpathFile != null) {
            File classFile = new File(classpathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                try (FileInputStream inputStream = new FileInputStream(classFile);
                     ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = inputStream.read(buf)) != -1) {
                        outputStream.write(buf, 0, len);
                    }
                    return defineClass(classname, outputStream.toByteArray(), 0, outputStream.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
