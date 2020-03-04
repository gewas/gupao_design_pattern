package com.gupao.designpattern.decorator.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能按钮实体
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 22:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Function implements Comparable<Function> {
    private Long id;
    private String name;
    private String routePath;

    @Override
    public int compareTo(Function o) {
        return id.compareTo(o.id);
    }
}
