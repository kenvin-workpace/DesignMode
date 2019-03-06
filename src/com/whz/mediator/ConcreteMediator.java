package com.whz.mediator;

/**
 * Created by kevin on 2018/4/26 22:03
 * <p>
 * 描述：
 */
public class ConcreteMediator extends Mediator {

    @Override
    public void method() {
        colleagueA.action();
        colleagueB.action();
    }
}
