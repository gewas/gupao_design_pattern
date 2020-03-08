package com.gupao.designpattern.structural.flyweight.ticket;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 0:30
 */
public class Test {
    public static void main(String[] args) {
        ITicket t1 = TicketFactory.queryTicket("北京", "长沙");
        ITicket t2 = TicketFactory.queryTicket("北京", "长沙");
        ITicket t3 = TicketFactory.queryTicket("北京西", "长沙");

        t1.showInfo("一等座");
        t2.showInfo("二等座");
        t3.showInfo("二等座");
    }
}
