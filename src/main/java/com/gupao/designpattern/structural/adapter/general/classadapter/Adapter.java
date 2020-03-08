package com.gupao.designpattern.structural.adapter.general.classadapter;

import com.gupao.designpattern.structural.adapter.general.Adaptee;
import com.gupao.designpattern.structural.adapter.general.Target;

/**
 * 适配器
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 20:30
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void doLikeThis() {
        // do adapt things
        doLikeThat();
    }
}
