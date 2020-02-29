package com.gupao.designpattern.factory.factorymethod;

import com.gupao.designpattern.factory.simplefactory.ICourse;
import com.gupao.designpattern.factory.simplefactory.PythonCourse;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:20
 */
public class PythonFactory implements ICourseFactory {
    @Override
    public ICourse getCourse() {
        return new PythonCourse();
    }
}
