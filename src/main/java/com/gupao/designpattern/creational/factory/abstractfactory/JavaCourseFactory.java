package com.gupao.designpattern.creational.factory.abstractfactory;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:27
 */
public class JavaCourseFactory implements AbstractCourseFactory {
    @Override
    public ICourseNote getNote() {
        return new JavaCourseNote();
    }

    @Override
    public ICourseVideo getVideo() {
        return new JavaCourseVideo();
    }

    @Override
    public ICourseHomework getHomework() {
        return new JavaCourseHomework();
    }
}
