package com.gupao.designpattern.behavioral.visitor.general;

/**
 * 假设，访问者B只关注日志记录
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 22:03
 */
public class ConcreteVisitorB implements IVisitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println(element.toString());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println(element.toString());
    }
}
