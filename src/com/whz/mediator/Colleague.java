package com.whz.mediator;

/**
 * Created by kevin on 2018/4/26 21:57
 * <p>
 * 描述：
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void action();
}
