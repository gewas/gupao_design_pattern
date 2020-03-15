package com.gupao.designpattern.behavioral.strategy.homework.strategy;

/**
 * 删减暴力，性暗示
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 15:19
 */
public class CensorR12Strategy implements ICensorStrategy {
    @Override
    public String doCensor(String content) {
        content = content.replaceAll("性暗示", "***");
        content = content.replaceAll("暴力", "***");
        content = content.replaceAll("色情", "***");
        content = content.replaceAll("血腥", "***");
        return content;
    }
}
