package com.whz.factoryAbstract.brake;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/17 22:53
 * <p>
 * 描述：
 */
public class SUVBrake extends Ibrake {
    @Override
    public void brake() {
        Sysout.getInstance().print("suv brake");
    }
}
