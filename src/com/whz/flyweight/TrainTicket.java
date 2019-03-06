package com.whz.flyweight;

import com.whz.Sysout;

import java.util.Random;

/**
 * Created by kevin on 2018/4/29 22:21
 * <p>
 * 描述：
 */
public class TrainTicket implements ITicket {
    public String from;
    public String to;
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        Sysout.getInstance().print("购买 从 " + from + " 到 " + to + " 的 " + bunk + " 火车票 ,价格：" + price);
    }
}
