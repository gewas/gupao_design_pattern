package com.gupao.designpattern.behavioral.strategy.homework;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/15 15:33
 */
public class Test {
    public static void main(String[] args) {
        String useCase = "暴力 性暗示 色情 血腥 哈哈哈";
        CensorContext censorContext = new CensorContext();
        System.out.println("R18: " + censorContext.doCensor(useCase, CensorContext.CensorLevelEnum.R18));
        System.out.println("R15: " + censorContext.doCensor(useCase, CensorContext.CensorLevelEnum.R15));
        System.out.println("R12: " + censorContext.doCensor(useCase, CensorContext.CensorLevelEnum.R12));
    }
}
