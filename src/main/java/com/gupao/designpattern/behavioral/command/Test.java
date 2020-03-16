package com.gupao.designpattern.behavioral.command;

/**
 * 命令模式
 * <p>
 * 解耦了请求调用者与请求执行者
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 20:47
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.action(command);
        // 还可将接收者，调用者都抽象后，方便扩展，像jdk的Runnable接口
    }
}
