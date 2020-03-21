package com.gupao.designpattern.behavioral.mediator;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 23:54
 */
public class ConcreteColleagueA extends Colleague {

    protected ConcreteColleagueA(Mediator mediator) {
        super(mediator);
        mediator.setColleagueA(this);
    }

    public void selfMethodA() {
        System.out.println("ConcreteColleagueA can do this job");
    }

    public void cooperateMethodA() {
        mediator.cooperateWithB();
    }
}
