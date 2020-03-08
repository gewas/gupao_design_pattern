package com.gupao.designpattern.structural.adapter.poweradapter.classadapter;

import com.gupao.designpattern.structural.adapter.poweradapter.AC220;
import com.gupao.designpattern.structural.adapter.poweradapter.DC5;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 23:41
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5() {
        int output = output220() / 44;
        System.out.println("220v 转换后 5v");
        return output;
    }
}
