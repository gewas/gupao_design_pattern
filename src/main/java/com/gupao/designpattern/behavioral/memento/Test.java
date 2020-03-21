package com.gupao.designpattern.behavioral.memento;

/**
 * 备忘录模式（快照模式）
 * <p>
 * 将对象的内部状态保存成另一个数据类的快照，这些快照交由外部的快照管理类管理。
 * 通常都是一个栈式的结构。让我们可以作出“undo”操作。
 * <p>
 * 模式核心：
 * 1.Memento类，不直接使用源对象保存数据，只提取出必要保存的属性。可以结合原型模式，BeanUtils工具实现。
 * 2.CareTaker类，即外部快照托管，将保存的逻辑分离，职责专一。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/21 19:22
 */
public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker<Memento> careTaker = new CareTaker<>();

        originator.setState("AAAAAAA");
        careTaker.storeMemento(originator.createMemento());
        System.out.println(originator);
        originator.setState("BBBBBBBB");
        careTaker.storeMemento(originator.createMemento());
        System.out.println(originator);
        originator.setState("ccccccccc");
        System.out.println(originator);
        originator.restoreMemento(careTaker.getMemento());
        System.out.println(originator);
        originator.restoreMemento(careTaker.getMemento());
        System.out.println(originator);
    }
}
