package com.gupao.designpattern.structural.flyweight.jdk;

/**
 * String的享元模式实现的较为特别，它使用了常量池。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/7 23:52
 */
public class StringTest {
    public static void main(String[] args) throws InterruptedException {
        String s1 = "hello";
        String s2 = "hello";
        // true 此处相等很好理解，因为String存在常量池
        System.out.println(s1 == s2);

        String s3 = "he" + "llo";
        // true 此处相等是因为对于字符串常量的拼接操作，在编译时会被优化成拼接结果，同“hello”相同，指向的还是同一个常量池中的String
        // 且常量池中不会存在“he” 和 “llo”
        System.out.println(s1 == s3);

        String s4 = "h" + new String("ello");
        // false 这里因为在运行时new的String对象，所以编译时不会优化。所以是拼接后生成的新对象
        System.out.println(s1 == s4);

        String s5 = new String("hello");
        // false 不难理解
        System.out.println(s1 == s5);

        String s6 = s5.intern();
        // true 查看文档可知，该方法会返回常量池中和自身equals的对象
        System.out.println(s1 == s6);

        String s7 = "hel";
        String s8 = "lo";
        String s9 = s7 + s8;
        // false 编译时并不会对变量做优化，即便在我们看起来他们很直观的就是“hello”
        System.out.println(s1 == s9);


    }
}
