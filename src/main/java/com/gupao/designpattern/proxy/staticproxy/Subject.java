package com.gupao.designpattern.proxy.staticproxy;

/**
 * 代理对象
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/1 22:40
 */
public class Subject implements ISubject {
    @Override
    public void doWork() {
        System.out.println("do do do");
    }
}
