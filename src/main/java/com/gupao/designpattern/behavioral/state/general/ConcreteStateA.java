package com.gupao.designpattern.behavioral.state.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 18:52
 */
public class ConcreteStateA implements IState {
    @Override
    public void action() {
        System.out.println("A状态时，这么做");
    }
}
