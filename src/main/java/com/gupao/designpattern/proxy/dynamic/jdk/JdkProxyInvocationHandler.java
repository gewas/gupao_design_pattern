package com.gupao.designpattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Jdk动态代理的重要部分，InvocationHandler，负责执行真正的代理逻辑。
 * <p>
 * 此处使用泛型完全没必要
 *
 * @author gewas
 * @version 1.0
 */
public class JdkProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public JdkProxyInvocationHandler(Object target) {
        this.target = target;
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
        System.out.println("before doWork()");
    }

    private void after() {
        System.out.println("after doWork()");
    }
}
