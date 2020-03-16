package com.gupao.designpattern.behavioral.command;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/16 20:42
 */
public class Invoker {

    public void action(ICommand command) {
        command.execute();
    }
}
