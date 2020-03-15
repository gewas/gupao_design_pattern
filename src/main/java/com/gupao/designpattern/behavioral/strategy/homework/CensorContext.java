package com.gupao.designpattern.behavioral.strategy.homework;

import com.gupao.designpattern.behavioral.strategy.homework.strategy.CensorR12Strategy;
import com.gupao.designpattern.behavioral.strategy.homework.strategy.CensorR15Strategy;
import com.gupao.designpattern.behavioral.strategy.homework.strategy.CensorR18Strategy;
import com.gupao.designpattern.behavioral.strategy.homework.strategy.ICensorStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 内容审核上下文
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 15:16
 */
public class CensorContext {

    private static final Map<CensorLevelEnum, ICensorStrategy> CENSOR_STRATEGY_MAP;

    static {
        CENSOR_STRATEGY_MAP = new HashMap<>(8);
        CENSOR_STRATEGY_MAP.put(CensorLevelEnum.R12, new CensorR12Strategy());
        CENSOR_STRATEGY_MAP.put(CensorLevelEnum.R15, new CensorR15Strategy());
        CENSOR_STRATEGY_MAP.put(CensorLevelEnum.R18, new CensorR18Strategy());
    }

    public String doCensor(String content, CensorLevelEnum level) {
        return getStrategy(level).doCensor(content);
    }

    public static ICensorStrategy getStrategy(CensorLevelEnum level) {
        return CENSOR_STRATEGY_MAP.get(level);
    }

    public enum CensorLevelEnum {
        R12, R15, R18
    }
}
