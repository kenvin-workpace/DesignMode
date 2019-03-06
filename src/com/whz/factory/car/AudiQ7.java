package com.whz.factory.car;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/17 21:59
 * <p>
 * 描述：
 */
public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        Sysout.getInstance().print(" Q7 Start");
    }

    @Override
    public void selfNavigation() {
        Sysout.getInstance().print(" Q7 Navigation");
    }
}
