package com.gupao.designpattern.structural.adapter.general.objectadapter;


import com.gupao.designpattern.structural.adapter.general.Adaptee;
import com.gupao.designpattern.structural.adapter.general.Target;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 20:47
 */
public class Test {
    public static void main(String[] args) {
        new Test().doWork(new Adapter(new Adaptee()));
    }

    public void doWork(Target target) {
        target.doLikeThis();
    }
}
