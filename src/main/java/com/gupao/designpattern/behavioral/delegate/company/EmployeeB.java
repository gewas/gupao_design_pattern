package com.gupao.designpattern.behavioral.delegate.company;

/**
 * 被委派类B
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 20:48
 */
public class EmployeeB implements IEmployee {

    protected String goodAt = "平面设计";

    @Override
    public void doTask(String task) {
        System.out.println("我是员工B，我擅长" + goodAt + ",现在开始做" + task + "工作");
    }
}
