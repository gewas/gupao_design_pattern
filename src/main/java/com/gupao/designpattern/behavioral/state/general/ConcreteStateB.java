package com.gupao.designpattern.behavioral.state.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 18:52
 */
public class ConcreteStateB implements IState {
    @Override
    public void action() {
        System.out.println("B状态时，那么做");
    }
}
