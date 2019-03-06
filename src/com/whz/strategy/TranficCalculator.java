package com.whz.strategy;

/**
 * Created by kevin on 2018/4/17 23:14
 * <p>
 * 描述：
 */
public class TranficCalculator {

    private ICalcStrategy mStrategy;

    public TranficCalculator setStrategy(ICalcStrategy strategy) {
        this.mStrategy = strategy;
        return this;
    }

    public String getCalculatorPrice(int price) {
        return mStrategy.calculatePrice(price);
    }
}
