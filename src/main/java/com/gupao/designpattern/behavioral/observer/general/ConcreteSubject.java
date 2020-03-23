package com.gupao.designpattern.behavioral.observer.general;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/23 22:32
 */
public class ConcreteSubject<E> implements ISubject<E> {

    private List<IObserver<E>> observers = new ArrayList<>();

    @Override
    public boolean attach(IObserver<E> observer) {
        return !observers.contains(observer) && observers.add(observer);
    }

    @Override
    public boolean detach(IObserver<E> observer) {
        return observers.remove(observer);
    }

    @Override
    public void notify(E event) {
        for (IObserver<E> observer : observers) {
            observer.update(event);
        }
    }
}
