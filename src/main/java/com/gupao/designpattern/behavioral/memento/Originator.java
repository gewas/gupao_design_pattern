package com.gupao.designpattern.behavioral.memento;

/**
 * 状态变动类
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 19:14
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        setState(memento.getState());
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
