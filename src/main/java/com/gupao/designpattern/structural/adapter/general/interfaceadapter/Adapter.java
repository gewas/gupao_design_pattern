package com.gupao.designpattern.structural.adapter.general.interfaceadapter;

import com.gupao.designpattern.structural.adapter.general.Adaptee;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 23:34
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void doLikeAFromThat() {
        adaptee.doLikeThat();
    }

    @Override
    public void doLikeB() {

    }

    @Override
    public void doLikeC() {

    }
}
