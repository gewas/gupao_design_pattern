package com.gupao.designpattern.behavioral.delegate.company;

/**
 * 委派
 * <p>
 * 老板只管交任务给主管，主管委派员工干活
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 20:43
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("海报", new Leader());
    }
}
