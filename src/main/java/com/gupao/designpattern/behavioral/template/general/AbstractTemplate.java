package com.gupao.designpattern.behavioral.template.general;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 20:52
 */
public abstract class AbstractTemplate {

    public final void templateMethod() {
        start();
        if (needMiddle()) {
            middle();
        }
        end();
    }

    protected void start() {
        System.out.println("start()");
    }

    protected void middle() {
        System.out.println("middle()");
    }

    protected void end() {
        System.out.println("end()");
    }

    protected boolean needMiddle() {
        return false;
    }

}
