package com.whz.decorator.simple1;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/29 21:43
 * <p>
 * 描述：
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(IComponent component) {
        super(component);
    }

    @Override
    public void operate() {
        operatorA();
        super.operate();
        operatorB();
    }

    private void operatorA() {
        Sysout.getInstance().print("operatorA");
    }

    private void operatorB() {
        Sysout.getInstance().print("operatorB");
    }
}
