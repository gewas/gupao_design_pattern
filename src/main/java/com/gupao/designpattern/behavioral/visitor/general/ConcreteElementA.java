package com.gupao.designpattern.behavioral.visitor.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 21:58
 */
public class ConcreteElementA implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public void operateA() {
        System.out.println("ConcreteElementA.operateA()");
    }
}
