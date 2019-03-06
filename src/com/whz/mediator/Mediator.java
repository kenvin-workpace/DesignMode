package com.whz.mediator;

/**
 * Created by kevin on 2018/4/26 21:57
 * <p>
 * 描述：
 */
public abstract class Mediator {

    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public abstract void method();
}
