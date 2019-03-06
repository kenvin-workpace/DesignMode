package com.whz.factoryAbstract.brake;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/17 22:52
 * <p>
 * 描述：
 */
public class NormalBrake extends Ibrake {
    @Override
    public void brake() {
        Sysout.getInstance().print("normal brake");
    }
}
