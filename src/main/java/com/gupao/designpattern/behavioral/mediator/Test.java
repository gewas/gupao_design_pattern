package com.gupao.designpattern.behavioral.mediator;

/**
 * 中介者模式
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 0:04
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        colleagueA.cooperateMethodA();
        colleagueB.cooperateMethodB();
    }
}
