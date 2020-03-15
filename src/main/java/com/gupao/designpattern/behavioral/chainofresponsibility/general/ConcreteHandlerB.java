package com.gupao.designpattern.behavioral.chainofresponsibility.general;

/**
 * 处理节点实现类B
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:13
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("targetB".equals(request)) {
            System.out.println("ConcreteHandlerB handling request");
            // 此处返回，该写法只适用于：责任链中有很多处理节点，请求只需要被其中任一个处理即可达成目的的场景。
            return;
        }
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
