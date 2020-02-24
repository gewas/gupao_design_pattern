package com.gupao.designpattern.factory.factorymethod;

import net.designpattern.factory.simplefactory.ICourse;
import net.designpattern.factory.simplefactory.JavaCourse;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:20
 */
public class JavaFactory implements ICourseFactory {
    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }
}
