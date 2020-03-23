package com.gupao.designpattern.behavioral.observer.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:30
 */
public interface ISubject<E> {
    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}
