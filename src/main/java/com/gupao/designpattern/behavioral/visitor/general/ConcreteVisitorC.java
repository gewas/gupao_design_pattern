package com.gupao.designpattern.behavioral.visitor.general;

/**
 * 假设，访问者B只关注统计
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 22:03
 */
public class ConcreteVisitorC implements IVisitor {

    private int[] counter = new int[2];

    @Override
    public void visit(ConcreteElementA element) {
        counter[0]++;
        System.out.println("A元素使用次数：" + counter[0]);
    }

    @Override
    public void visit(ConcreteElementB element) {
        counter[1]++;
        System.out.println("B元素使用次数：" + counter[1]);
    }
}
