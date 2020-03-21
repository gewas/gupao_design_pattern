package com.gupao.designpattern.behavioral.mediator;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 23:54
 */
public class ConcreteColleagueB extends Colleague {

    protected ConcreteColleagueB(Mediator mediator) {
        super(mediator);
        mediator.setColleagueB(this);
    }

    public void selfMethodB() {
        System.out.println("ConcreteColleagueB can do this job");
    }

    public void cooperateMethodB() {
        mediator.cooperateWithA();
    }
}
