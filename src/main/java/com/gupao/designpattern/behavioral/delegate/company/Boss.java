package com.gupao.designpattern.behavioral.delegate.company;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 20:49
 */
public class Boss {

    public void command(String task, Leader leader) {
        leader.doTask(task);
    }
}
