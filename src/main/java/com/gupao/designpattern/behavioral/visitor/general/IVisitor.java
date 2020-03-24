package com.gupao.designpattern.behavioral.visitor.general;

/**
 * 定义了访问者的抽象。
 * <p>
 * 所有的访问者都会访问这些元素，只不过他们的关注点不同。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 21:26
 */
public interface IVisitor {

    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
