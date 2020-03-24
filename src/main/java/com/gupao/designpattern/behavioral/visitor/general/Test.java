package com.gupao.designpattern.behavioral.visitor.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 22:31
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.addElement(new ConcreteElementA());
        structure.addElement(new ConcreteElementA());
        structure.addElement(new ConcreteElementB());
        structure.addElement(new ConcreteElementB());
        structure.addElement(new ConcreteElementA());
        structure.addElement(new ConcreteElementA());
        structure.addElement(new ConcreteElementA());
        structure.addElement(new ConcreteElementB());
        structure.accept(new ConcreteVisitorA());
        structure.accept(new ConcreteVisitorB());
        structure.accept(new ConcreteVisitorC());
    }
}
