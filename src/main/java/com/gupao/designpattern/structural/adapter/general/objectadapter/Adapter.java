package com.gupao.designpattern.structural.adapter.general.objectadapter;

import com.gupao.designpattern.structural.adapter.general.Adaptee;
import com.gupao.designpattern.structural.adapter.general.Target;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 23:29
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doLikeThis() {
        // do adapt things
        adaptee.doLikeThat();
    }
}
