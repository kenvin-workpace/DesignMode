package com.whz.strategy;

/**
 * Created by kevin on 2018/4/17 23:17
 * <p>
 * 描述：
 */
public class SubWayStrtegy implements ICalcStrategy {
    @Override
    public String calculatePrice(int price) {
        return "SubWayStrtegy";
    }
}
