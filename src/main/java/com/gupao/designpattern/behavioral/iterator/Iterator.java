package com.gupao.designpattern.behavioral.iterator;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 20:26
 */
public interface Iterator<E> {

    E next();

    boolean hasNext();
}
