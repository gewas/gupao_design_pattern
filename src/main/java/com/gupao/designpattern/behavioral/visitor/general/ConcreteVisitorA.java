package com.gupao.designpattern.behavioral.visitor.general;

/**
 * 假设，访问者A只关注执行结果
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 22:03
 */
public class ConcreteVisitorA implements IVisitor {
    @Override
    public void visit(ConcreteElementA element) {
        element.operateA();
        System.out.println("A元素执行完毕");
    }

    @Override
    public void visit(ConcreteElementB element) {
        element.operateB();
        System.out.println("B元素执行完毕");
    }
}
