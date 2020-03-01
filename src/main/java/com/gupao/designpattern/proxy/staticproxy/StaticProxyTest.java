package com.gupao.designpattern.proxy.staticproxy;

/**
 * 静态代理测试类
 *
 * 静态代理，简单，可以针对性的做代理增强。
 * 但是由于是硬编码，需要手动编写很多类，没有配套的代理类就没得用，不灵活。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 22:44
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        ISubject subject = new SubjectStaticProxy(new Subject());
        subject.doWork();
    }
}
