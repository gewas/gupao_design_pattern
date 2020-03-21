package com.gupao.designpattern.behavioral.state.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 18:54
 */
public class Context {

    public static final IState STATE_A = new ConcreteStateA();
    public static final IState STATE_B = new ConcreteStateB();

    private IState currentState = STATE_A;

    public void setState(IState state) {
        currentState = state;
    }

    public void action() {
        currentState.action();
    }
}
