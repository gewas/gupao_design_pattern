package com.gupao.designpattern.behavioral.delegate.company;

/**
 * 被委派类A
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 20:48
 */
public class EmployeeA implements IEmployee {

    protected String goodAt = "编程";

    @Override
    public void doTask(String task) {
        System.out.println("我是员工A，我擅长" + goodAt + ",现在开始做" + task + "工作");
    }
}
