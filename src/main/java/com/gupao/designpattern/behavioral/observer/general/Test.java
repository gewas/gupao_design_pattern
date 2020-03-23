package com.gupao.designpattern.behavioral.observer.general;

/**
 * 观察者模式
 *
 * 最基础，最原始的写法
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:37
 */
public class Test {

    public static void main(String[] args) {
        ISubject<String> subject = new ConcreteSubject<>();
        subject.attach(new ConcreteObserver<>());
        subject.attach(new ConcreteObserver<>());
        subject.attach(new ConcreteObserver<>());
        subject.attach(new ConcreteObserver<>());
        subject.notify("hi there");
    }
}
