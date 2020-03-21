package com.gupao.designpattern.behavioral.mediator;

/**
 * 中介者
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 23:49
 */
public abstract class Mediator {

    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    /**
     * 需要A协作
     */
    public abstract void cooperateWithA();

    /**
     * 需要B协作
     */
    public abstract void cooperateWithB();
}
