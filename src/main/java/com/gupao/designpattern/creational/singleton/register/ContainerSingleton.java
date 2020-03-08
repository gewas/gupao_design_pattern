package com.gupao.designpattern.creational.singleton.register;

import com.gupao.designpattern.creational.singleton.lazy.LazySingleton;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 8.容器式单例
 * 优点：构建了约定：容器统一管理单例，
 * 缺点：
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/27 0:28
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static final Map<String, Object> IOC = new ConcurrentHashMap<>(16);

    public static Object getInstance(String classname) {
        if (!IOC.containsKey(classname)) {
            synchronized (IOC) {
                if (!IOC.containsKey(classname)) {
                    try {
                        Constructor c = Class.forName(classname).getDeclaredConstructor();
                        c.setAccessible(true);
                        Object instance = c.newInstance();
                        System.out.println(instance);
                        IOC.put(classname, instance);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return IOC.get(classname);
    }

    public static void main(String[] args) {
        Thread ta = new Thread(new ContainerSingletonTestExecutor());
        Thread tb = new Thread(new ContainerSingletonTestExecutor());
        Thread tc = new Thread(new ContainerSingletonTestExecutor());
        Thread td = new Thread(new ContainerSingletonTestExecutor());
        ta.start();
        tb.start();
        tc.start();
        td.start();
    }

    private static class ContainerSingletonTestExecutor implements Runnable {
        @Override
        public void run() {
            Object o = ContainerSingleton.getInstance(LazySingleton.class.getCanonicalName());
            System.out.println(Thread.currentThread().getName() + ": " + o);
        }
    }
}
