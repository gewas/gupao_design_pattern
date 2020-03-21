package com.gupao.designpattern.behavioral.mediator;

/**
 * 抽象同事类
 * <p>
 * 确保同事类都要持有中介类（因为都要经由中介来与别的同事合作）
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 23:50
 */
public abstract class Colleague {

    protected Mediator mediator;

    protected Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
