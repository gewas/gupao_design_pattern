package com.gupao.designpattern.behavioral.template.homework;

import java.util.List;
import java.util.Random;

/**
 * todo 简要信息
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/12 1:48
 */
public class Test {
    public static void main(String[] args) {
        ChefMaster cm = new ChefMaster("隔壁老王的厨房");

        Chef chef1 = new Chef("Tom")
                .addToCookbook(MenuItem.builder().name("东坡肉").menuType(MenuType.DISH).price(58).build())
                .addToCookbook(MenuItem.builder().name("干煸土豆丝").menuType(MenuType.DISH).price(38).build())
                .addToCookbook(MenuItem.builder().name("农家小炒肉").menuType(MenuType.DISH).price(48).build())
                .addToCookbook(MenuItem.builder().name("烤羊排").menuType(MenuType.DISH).price(88).build())
                .addToCookbook(MenuItem.builder().name("清蒸鲈鱼").menuType(MenuType.DISH).price(68).build())
                .addToCookbook(MenuItem.builder().name("清蒸鲈鱼").menuType(MenuType.DISH).price(68).build())
                .addToCookbook(MenuItem.builder().name("小小酥").menuType(MenuType.DESSERT).price(48).build())
                .addToCookbook(MenuItem.builder().name("鲜榨橙汁").menuType(MenuType.DRINK).price(28).build())
                .addToCookbook(MenuItem.builder().name("银耳燕窝").menuType(MenuType.DRINK).price(68).build());
        Chef chef2 = new Chef("安东尼·雷欧")
                .addToCookbook(MenuItem.builder().name("炭烧牛排").menuType(MenuType.DISH).price(88).build())
                .addToCookbook(MenuItem.builder().name("意大利千层面").menuType(MenuType.DISH).price(48).build())
                .addToCookbook(MenuItem.builder().name("芝士土豆泥").menuType(MenuType.DISH).price(38).build())
                .addToCookbook(MenuItem.builder().name("浓情生巧").menuType(MenuType.DESSERT).price(48).build())
                .addToCookbook(MenuItem.builder().name("重芝士球").menuType(MenuType.DESSERT).price(38).build())
                .addToCookbook(MenuItem.builder().name("鸡尾酒").menuType(MenuType.DRINK).price(38).build())
                .addToCookbook(MenuItem.builder().name("现榨椰奶").menuType(MenuType.DRINK).price(28).build());
        Chef chef3 = new Chef("张老六")
                .addToCookbook(MenuItem.builder().name("佛跳墙").menuType(MenuType.DISH).price(288).build())
                .addToCookbook(MenuItem.builder().name("黯然销魂饭").menuType(MenuType.DISH).price(68).build());

        cm.hireChef(chef1);
        cm.hireChef(chef2);
        cm.hireChef(chef3);

        cm.addDishResolver(MenuType.DISH, new DishResolver() {
            @Override
            public String getCooker() {
                return "专业锅具";
            }

            @Override
            public String getContainer() {
                return "精美餐盘";
            }

            @Override
            public Boolean needDecorate() {
                return true;
            }

            @Override
            public String getDecorateWith() {
                return "配菜";
            }

            @Override
            public int getMakingTime() {
                return 15;
            }
        })
                .addDishResolver(MenuType.DESSERT, new DishResolver() {
                    @Override
                    public String getCooker() {
                        return "甜点制作套件";
                    }

                    @Override
                    public String getContainer() {
                        return "甜品盒";
                    }

                    @Override
                    public Boolean needDecorate() {
                        return true;
                    }

                    @Override
                    public String getDecorateWith() {
                        return "天然蜂蜜";
                    }

                    @Override
                    public int getMakingTime() {
                        return 10;
                    }
                })
                .addDishResolver(MenuType.DRINK, new DishResolver() {
                    @Override
                    public String getCooker() {
                        return "榨汁机";
                    }

                    @Override
                    public String getContainer() {
                        return "杯子";
                    }

                    @Override
                    public int getMakingTime() {
                        return 5;
                    }
                });

        List<String> menu = cm.listMenu();
        String item = menu.get(new Random().nextInt(menu.size()));
        cm.takeOrder(item);

    }
}
