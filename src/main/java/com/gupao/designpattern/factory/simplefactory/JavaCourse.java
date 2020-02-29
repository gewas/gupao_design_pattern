package com.gupao.designpattern.factory.simplefactory;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:15
 */
public class JavaCourse implements ICourse {
    @Override
    public String getName() {
        return "java";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
