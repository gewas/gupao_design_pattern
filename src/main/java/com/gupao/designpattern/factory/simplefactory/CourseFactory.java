package com.gupao.designpattern.factory.simplefactory;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/2/24 11:08
 */
public class CourseFactory {

    public ICourse getCourse(String name) {
        if (null != name && !"".equals(name)) {
            switch (name.toLowerCase()) {
                case "java": {
                    return new JavaCourse();
                }
                case "python": {
                    return new PythonCourse();
                }
                default:
            }
        }
        return null;
    }

    public ICourse getCourse(Class<? extends ICourse> klass) {
        if (klass != null) {
            try {
                return klass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
