package com.gupao.designpattern.facade;

/**
 * 门面模式，将子系统中众多接口统一管理并（简化）提供对外服务。
 *
 * @author gewas
 * @version 1.0
 * @date 2020/3/4 20:57
 */
public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public void doWorkA() {
        subSystemA.doWorkA();
    }

    public void doWorkB() {
        subSystemB.doWorkB();
    }

    public void doWorkC() {
        subSystemC.doWorkC();
    }

}
