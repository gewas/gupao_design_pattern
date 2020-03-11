package com.gupao.designpattern.behavioral.template.homework;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;
import java.util.TreeSet;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 23:49
 */
@Data
public class Chef {

    private String name;
    private Set<MenuItem> cookbook = new TreeSet<>();

    public Chef(String name) {
        this.name = name;
    }

    public final void makeDish(MenuItem menuItem, DishResolver dishResolver) {
        // 模板
        startMaking(menuItem);
        System.out.println("使用" + dishResolver.getCooker() + "制作...");
        System.out.println("制作需要" + dishResolver.getMakingTime() + "分钟...");
        System.out.println("使用" + dishResolver.getContainer() + "盛装...");
        if (dishResolver.needDecorate()) {
            System.out.println("使用" + dishResolver.getDecorateWith() + "装饰...");
        }
        complete(menuItem);
    }

    public final Chef addToCookbook(MenuItem menuItem) {
        cookbook.add(menuItem);
        return this;
    }

    private void startMaking(MenuItem menuItem) {
        System.out.println(name + "大厨正在为您制作：" + menuItem.getBrief());
    }

    private void complete(MenuItem menuItem) {
        System.out.println(menuItem.getBrief() + "制作完毕，请享用");
    }
}
