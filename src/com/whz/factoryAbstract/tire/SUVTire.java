package com.whz.factoryAbstract.tire;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/17 22:49
 * <p>
 * 描述：
 */
public class SUVTire extends ITire {
    @Override
    public void tire() {
        Sysout.getInstance().print("suv tire");
    }
}
