package com.gupao.designpattern.behavioral.observer.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:35
 */
public class ConcreteObserver<E> implements IObserver<E> {
    @Override
    public void update(E event) {
        System.out.println(toString()+" - receive event: " + event);
    }
}
