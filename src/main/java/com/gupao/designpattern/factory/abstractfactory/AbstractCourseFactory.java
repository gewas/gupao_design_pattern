package com.gupao.designpattern.factory.abstractfactory;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:22
 */
public interface AbstractCourseFactory {

    ICourseNote getNote();

    ICourseVideo getVideo();

    ICourseHomework getHomework();
}
