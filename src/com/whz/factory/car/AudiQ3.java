package com.whz.factory.car;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/17 21:58
 * <p>
 * 描述：
 */
public class AudiQ3 extends AudiCar {
    @Override
    public void drive() {
        Sysout.getInstance().print(" Q3 Start");
    }

    @Override
    public void selfNavigation() {
        Sysout.getInstance().print(" Q3 Navigation");
    }
}
