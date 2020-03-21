package com.gupao.designpattern.behavioral.mediator;

/**
 * 中介者模式，苦了中介者，爽了需要相互依赖通信的参与者。
 * <p>
 * 中介多面能手，要知道每个参与者的调用关系，合作关系，依赖关系。
 * 辛苦了中介者但是集中了复杂度，可统一管理依赖配置关系。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 23:56
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void cooperateWithA() {
        colleagueA.selfMethodA();
    }

    @Override
    public void cooperateWithB() {
        colleagueB.selfMethodB();
    }
}
