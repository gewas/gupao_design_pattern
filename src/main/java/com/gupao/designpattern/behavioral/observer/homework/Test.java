package com.gupao.designpattern.behavioral.observer.homework;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/24 21:14
 */
public class Test {
    public static void main(String[] args) {
        User student = new User(10L, "gewas");

        Teacher tom = new Teacher(new User(1L, "Tom"));
        Teacher mic = new Teacher(new User(2L, "Mic"));
        Teacher james = new Teacher(new User(3L, "James"));

        Gper gper = Gper.getInstance();

        gper.subscribeQuestion(tom);
        gper.subscribeQuestion(mic);
        gper.subscribeQuestion(james);

        gper.makeQuestion(new Question("Java 9 的新特性有哪些？", "如题求教！", student.getUsername()));
    }
}
