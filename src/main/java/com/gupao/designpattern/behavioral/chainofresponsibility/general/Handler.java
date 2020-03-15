package com.gupao.designpattern.behavioral.chainofresponsibility.general;

/**
 * 处理节点抽象类
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 14:10
 */
public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}
