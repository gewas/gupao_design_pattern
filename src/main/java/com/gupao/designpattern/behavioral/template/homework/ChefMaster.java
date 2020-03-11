package com.gupao.designpattern.behavioral.template.homework;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/11 23:42
 */
public class ChefMaster implements IBoss {

    private String brandName;

    private final TreeSet<MenuItem> menuItems = new TreeSet<>();
    private final List<Chef> chefList = new ArrayList<>(8);
    private final Map<String, Chef> chefMapping = new HashMap<>(8);
    private final Map<MenuType, DishResolver> resolverMapping = new HashMap<>(8);

    public ChefMaster(String brandName) {
        this.brandName = brandName;
    }

    // 看菜单
    public List<String> listMenu() {
        System.out.println("欢迎光临" + brandName);
        System.out.println("本店有新东方大厨：");
        chefList.forEach(chef -> System.out.println(chef.getName()));
        System.out.println("欢迎品尝，请看菜单：");
        List<String> menuNameList = menuItems.stream().map(MenuItem::getDetail).collect(Collectors.toList());
        menuNameList.forEach(System.out::println);
        return menuNameList;
    }

    // 点单
    public void takeOrder(String menuItemName) {
        // 委派厨师
        Chef chef = chefMapping.get(menuItemName);
        MenuItem menuItem = parseOrder(menuItemName);
        // 委派做法
        DishResolver resolver = getResolver(menuItem);
        chef.makeDish(menuItem, resolver);
    }

    private MenuItem parseOrder(String menuItemName) {
        return menuItems.stream().filter(item -> StringUtils.equals(menuItemName, item.getDetail()))
                .findFirst().get();
    }

    private DishResolver getResolver(MenuItem menuItem) {
        return resolverMapping.get(menuItem.getMenuType());
    }

    // 雇佣厨师
    @Override
    public void hireChef(Chef chef) {
        chef.getCookbook().forEach(item -> {
            menuItems.add(item);
            chefMapping.put(item.getDetail(), chef);
        });
        chefList.add(chef);
    }

    // 解雇厨师
    @Override
    public void fireChef(Chef chef) {
        chef.getCookbook().forEach(item -> {
            menuItems.remove(item);
            chefMapping.remove(item.getDetail());
        });
        chefList.remove(chef);
    }

    public ChefMaster addDishResolver(MenuType type, DishResolver resolver) {
        resolverMapping.put(type, resolver);
        return this;
    }
}
