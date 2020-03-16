package com.gupao.designpattern.behavioral.command;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 20:44
 */
public class ConcreteCommand implements ICommand {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
