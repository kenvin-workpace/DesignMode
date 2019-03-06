package com.whz.bridge;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/30 10:29
 * <p>
 * 描述：
 */
public class LargeCoffee extends Coffee {

    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        Sysout.getInstance().print("大杯的" + coffeeAdditives.addSomething() + "咖啡");
    }
}
