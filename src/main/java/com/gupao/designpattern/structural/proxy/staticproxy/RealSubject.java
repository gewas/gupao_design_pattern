package com.gupao.designpattern.structural.proxy.staticproxy;

/**
 * 代理对象
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 22:40
 */
public class RealSubject implements ISubject {
    @Override
    public void doWork() {
        System.out.println("do do do");
    }
}
