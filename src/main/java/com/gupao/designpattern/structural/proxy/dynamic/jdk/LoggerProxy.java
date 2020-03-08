package com.gupao.designpattern.structural.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Jdk动态代理的重要部分，InvocationHandler，负责执行真正的代理逻辑。
 * <p>
 * 顺便封装了获取代理类的方法，让客户端调用更简单。
 *
 * @author gewas
 * @version 1.0
 */
public class LoggerProxy implements InvocationHandler {

    private Object target;

    private LoggerProxy(Object target) {
        this.target = target;
    }

    public static Object getProxy(Object target) {
        LoggerProxy loggerProxy = new LoggerProxy(target);
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), loggerProxy);
    }

    /**
     * @param proxy  动态代理生成的$Proxy0对象
     * @param method 调用的方法
     * @param args   调用方法的传参
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("log before " + System.currentTimeMillis());
    }

    private void after() {
        System.out.println("log after " + System.currentTimeMillis());
    }
}
