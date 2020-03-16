package com.gupao.designpattern.behavioral.iterator;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 20:28
 */
public interface IAggregate<E> {
    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}
