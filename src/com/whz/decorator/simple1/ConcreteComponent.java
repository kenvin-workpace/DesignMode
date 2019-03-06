package com.whz.decorator.simple1;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/29 21:41
 * <p>
 * 描述：
 */
public class ConcreteComponent extends IComponent {

    @Override
    public void operate() {
        Sysout.getInstance().print("具体逻辑");
    }
}
