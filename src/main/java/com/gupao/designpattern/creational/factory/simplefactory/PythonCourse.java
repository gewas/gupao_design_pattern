package com.gupao.designpattern.creational.factory.simplefactory;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:15
 */
public class PythonCourse implements ICourse {
    @Override
    public String getName() {
        return "python";
    }

    @Override
    public double getPrice() {
        return 97;
    }
}
