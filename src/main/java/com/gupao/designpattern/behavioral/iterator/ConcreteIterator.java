package com.gupao.designpattern.behavioral.iterator;

import java.util.List;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 20:32
 */
public class ConcreteIterator<E> implements Iterator<E> {

    private List<E> list;
    private int cursor;

    public ConcreteIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        return list.get(cursor++);
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }
}
