package com.gupao.designpattern.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * Jdk动态代理测试类
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 22:53
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        ISubject subjectJdk = (ISubject) Proxy.newProxyInstance(ISubject.class.getClassLoader(), new Class[]{ISubject.class},
                new JdkProxyInvocationHandler(new Subject()));
        subjectJdk.doWork();
    }
}
