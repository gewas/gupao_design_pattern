package com.gupao.designpattern.structural.adapter.thirdlogin.v2.adapter;

import com.gupao.designpattern.structural.adapter.thirdlogin.ResultMsg;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/9 0:06
 */
public interface IAdapter {
    boolean support(Object object);

    ResultMsg login(String id, Object adapter);
}
