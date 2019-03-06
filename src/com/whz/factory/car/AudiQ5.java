package com.whz.factory.car;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/17 21:59
 * <p>
 * 描述：
 */
public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        Sysout.getInstance().print(" Q5 Start");
    }

    @Override
    public void selfNavigation() {
        Sysout.getInstance().print(" Q5 Navigation");
    }
}
