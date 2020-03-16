package com.gupao.designpattern.behavioral.iterator;

/**
 * 迭代器模式
 * <p>
 * 适合在自己编写集合型数据结构时使用。
 * 可将迭代逻辑与集合管理逻辑分离。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 20:36
 */
public class Test {
    public static void main(String[] args) {
        IAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("a0");
        aggregate.add("a1");
        aggregate.add("a2");
        aggregate.add("a3");
        aggregate.add("a4");
        aggregate.remove("a3");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
