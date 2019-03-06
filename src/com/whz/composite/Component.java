package com.whz.composite;

/**
 * Created by kevin on 2018/4/29 20:34
 * <p>
 * 描述：
 */
public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void doSomething();

    public abstract void addChild(Component child);

    public abstract void removeChild(Component child);

    public abstract Component getChild(int index);

}
