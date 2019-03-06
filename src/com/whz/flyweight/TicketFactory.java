package com.whz.flyweight;

import com.whz.Sysout;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kevin on 2018/4/29 22:25
 * <p>
 * 描述：
 */
public class TicketFactory {
    static Map<String, ITicket> maps = new ConcurrentHashMap<>();

    public static ITicket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (maps.containsKey(key)) {
            Sysout.getInstance().print("使用缓存==> " + key);
            return maps.get(key);
        } else {
            Sysout.getInstance().print("创建对象==> " + key);
            TrainTicket ticket = new TrainTicket(from, to);
            maps.put(key, ticket);
            return ticket;
        }
    }
}
