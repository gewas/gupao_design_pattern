package com.gupao.designpattern.factory.abstractfactory;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:27
 */
public class PythonCourseFactory implements AbstractCourseFactory {
    @Override
    public ICourseNote getNote() {
        return new PythonCourseNote();
    }

    @Override
    public ICourseVideo getVideo() {
        return new PythonCourseVideo();
    }

    @Override
    public ICourseHomework getHomework() {
        return new PythonCourseHomework();
    }
}
