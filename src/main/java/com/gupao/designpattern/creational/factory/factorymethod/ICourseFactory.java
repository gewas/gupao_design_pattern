package com.gupao.designpattern.creational.factory.factorymethod;

import com.gupao.designpattern.creational.factory.simplefactory.ICourse;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:19
 */
public interface ICourseFactory {
    ICourse getCourse();
}
