package com.gupao.designpattern.behavioral.delegate.company;

import java.util.HashMap;
import java.util.Map;

/**
 * 委派类
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 20:48
 */
public class Leader implements IEmployee {

    private Map<String, IEmployee> employee = new HashMap<String, IEmployee>();

    public Leader() {
        employee.put("爬虫", new EmployeeA());
        employee.put("海报", new EmployeeB());
    }

    @Override
    public void doTask(String task) {
        if (!employee.containsKey(task)) {
            System.out.println("这个任务" + task + "超出我的能力范围");
            return;
        }
        employee.get(task).doTask(task);
    }
}
