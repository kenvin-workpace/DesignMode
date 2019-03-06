package com.whz.decorator.simple1;

/**
 * Created by kevin on 2018/4/29 21:42
 * <p>
 * 描述：
 */
public class Decorator extends IComponent {

    private IComponent component;

    public Decorator(IComponent component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
