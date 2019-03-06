package com.whz.factoryAbstract.tire;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/17 22:48
 * <p>
 * 描述：
 */
public class NormalTire extends ITire {
    @Override
    public void tire() {
        Sysout.getInstance().print("normal tire");
    }
}
