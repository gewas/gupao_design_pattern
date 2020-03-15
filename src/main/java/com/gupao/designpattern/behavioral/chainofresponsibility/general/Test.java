package com.gupao.designpattern.behavioral.chainofresponsibility.general;

/**
 * 如果这样原生地使用责任链，不仅产生迷惑，为什么一定要用handlerA当作执行的起点呢？
 * 还要一直setNextHandler()，很麻烦，不优雅。
 * 需要维护责任链的“头”和“尾”、以及让构建责任链的过程变优雅。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:16
 */
public class Test {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNextHandler(handlerB);

        String request = "targetB";

        handlerA.handleRequest(request);
    }
}
