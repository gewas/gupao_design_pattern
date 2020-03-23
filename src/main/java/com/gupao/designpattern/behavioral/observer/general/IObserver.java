package com.gupao.designpattern.behavioral.observer.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:31
 */
public interface IObserver<E> {

    void update(E event);
}
