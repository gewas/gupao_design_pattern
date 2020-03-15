package com.gupao.designpattern.behavioral.strategy.homework.strategy;

/**
 * 无删减
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 15:19
 */
public class CensorR18Strategy implements ICensorStrategy {
    @Override
    public String doCensor(String content) {
        return content;
    }
}
