package com.gupao.designpattern.structural.adapter.poweradapter.classadapter;

import com.gupao.designpattern.structural.adapter.poweradapter.DC5;

/**
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 23:42
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.output5();
    }
}
