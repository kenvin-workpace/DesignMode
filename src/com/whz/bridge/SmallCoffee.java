package com.whz.bridge;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/30 10:30
 * <p>
 * 描述：
 */
public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        Sysout.getInstance().print("小杯的" + coffeeAdditives.addSomething() + "咖啡");
    }
}
