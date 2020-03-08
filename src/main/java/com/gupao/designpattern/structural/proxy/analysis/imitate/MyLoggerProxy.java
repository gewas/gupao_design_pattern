package com.gupao.designpattern.structural.proxy.analysis.imitate;


import java.lang.reflect.Method;

/**
 *
 * @author gewas
 * @version 1.0
 */
public class MyLoggerProxy implements MyInvocationHandler {

    private Object target;

    private MyLoggerProxy(Object target) {
        this.target = target;
    }

    public static Object getProxy(Object target) {
        MyLoggerProxy loggerProxy = new MyLoggerProxy(target);
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), loggerProxy);
    }

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
