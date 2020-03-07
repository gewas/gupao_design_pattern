package com.gupao.designpattern.flyweight.jdk;

/**
 * Integer Long 这些包装类都默认做了一个Byte范围的池缓存(-128~127)
 * <p>
 * 调用valueOf()的时候，会先判断是否在池中，命中就自己取出来返回。
 * <p>
 * 通过实验还能验证，自动装箱就是调用了valueOf方法
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/7 23:52
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = new Integer(1);
        Integer i2 = Integer.valueOf(1);
        System.out.println(i1 == i2);

        Integer i3 = Integer.valueOf(1);
        System.out.println(i2 == i3);

        Integer i4 = 127;
        Integer i5 = Integer.valueOf(127);
        System.out.println(i4 == i5);

    }
}
