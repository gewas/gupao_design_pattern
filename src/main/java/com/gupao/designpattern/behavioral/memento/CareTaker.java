package com.gupao.designpattern.behavioral.memento;

import java.util.Stack;

/**
 * 备忘库（快照库）
 * <p>
 * 保管备忘，以备完成撤回操作
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 19:18
 */
public class CareTaker<E> {

    private Stack<E> mementoStack;

    {
        mementoStack = new Stack<>();
    }

    public E getMemento() {
        return mementoStack.pop();
    }

    public void storeMemento(E memento) {
        mementoStack.push(memento);
    }

}
