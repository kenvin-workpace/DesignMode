package com.whz.bridge;

/**
 * Created by kevin on 2018/4/30 10:28
 * <p>
 * 描述：
 */
public abstract class Coffee {
    protected CoffeeAdditives coffeeAdditives;

    public Coffee(CoffeeAdditives coffeeAdditives){
        this.coffeeAdditives = coffeeAdditives;
    }

    public abstract void makeCoffee();
}
