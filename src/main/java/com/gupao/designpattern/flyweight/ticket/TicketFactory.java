package com.gupao.designpattern.flyweight.ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gewas
 * @version 1.0
 * @date 2020/3/8 0:26
 */
public class TicketFactory {

    private static Map<String, ITicket> pool = new ConcurrentHashMap<>();

    public static ITicket queryTicket(String from, String to) {
        String intrinsicState = from + "->" + to;
        ITicket ticket = null;
        if (pool.containsKey(intrinsicState)) {
            ticket = pool.get(intrinsicState);
            System.out.println("<cache> " + System.identityHashCode(ticket));
        } else {
            ticket = new Ticket(from, to);
            pool.put(intrinsicState, ticket);
            System.out.println("<new> " + System.identityHashCode(ticket));
        }
        return ticket;
    }
}
