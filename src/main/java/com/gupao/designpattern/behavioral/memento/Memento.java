package com.gupao.designpattern.behavioral.memento;

/**
 * 备忘录类（快照类）
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 19:15
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
