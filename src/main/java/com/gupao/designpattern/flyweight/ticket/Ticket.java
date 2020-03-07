package com.gupao.designpattern.flyweight.ticket;

import java.util.Random;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 0:24
 */
public class Ticket implements ITicket {

    private String from;
    private String to;

    public Ticket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        int rest = new Random().nextInt(200);
        System.out.println(from + " -> " + to + " (" + bunk + ") 剩余：" + rest);
    }
}
