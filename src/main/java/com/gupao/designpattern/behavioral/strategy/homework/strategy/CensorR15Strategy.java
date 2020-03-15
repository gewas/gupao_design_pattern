package com.gupao.designpattern.behavioral.strategy.homework.strategy;

/**
 * 删减血腥暴力，性爱色情
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 15:19
 */
public class CensorR15Strategy implements ICensorStrategy {
    @Override
    public String doCensor(String content) {
        content = content.replaceAll("色情", "***");
        content = content.replaceAll("血腥", "***");
        return content;
    }
}
