package com.gupao.designpattern.structural.bridge.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 14:08
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {

    }
}
