package com.gupao.designpattern.proxy.staticproxy;

/**
 * 静态代理类
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 22:37
 */
public class SubjectStaticProxy implements ISubject {
    private ISubject target;

    public SubjectStaticProxy(ISubject target) {
        this.target = target;
    }

    private void before() {
        System.out.println("before doWork()");
    }

    private void after() {
        System.out.println("after doWork()");
    }

    @Override
    public void doWork() {
        before();
        target.doWork();
        after();
    }
}
