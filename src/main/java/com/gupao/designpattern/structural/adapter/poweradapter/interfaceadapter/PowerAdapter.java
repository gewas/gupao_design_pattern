package com.gupao.designpattern.structural.adapter.poweradapter.interfaceadapter;


import com.gupao.designpattern.structural.adapter.poweradapter.AC220;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 23:41
 */
public class PowerAdapter implements DC {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5() {
        int output = ac220.output220() / 44;
        System.out.println("220v 转换后 5v");
        return output;
    }

    @Override
    public int output9() {
        return 0;
    }

    @Override
    public int output12() {
        return 0;
    }

    @Override
    public int output24() {
        return 0;
    }

    @Override
    public int output36() {
        return 0;
    }
}
