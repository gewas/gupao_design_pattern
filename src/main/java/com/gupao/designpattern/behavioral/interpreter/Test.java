package com.gupao.designpattern.behavioral.interpreter;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/22 0:20
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new Calculator("1 + 2 + 3 + 4").calculate());
        System.out.println(new Calculator("1 + 2 * 3 - 4").calculate());
        System.out.println(new Calculator("1 + 2 * 3 - 4 / 5").calculate());
        System.out.println(new Calculator("( 10 + 32 ) * 93 - 240 / 5").calculate());
        System.out.println(new Calculator("10 + 32 * [ ( 93 - 240 ) / 5 ]").calculate());
    }
}
