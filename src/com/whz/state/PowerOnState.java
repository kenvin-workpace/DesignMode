package com.whz.state;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/18 22:05
 * <p>
 * 描述：
 */
public class PowerOnState implements ITvState {

    @Override
    public void nextChannel() {
        Sysout.getInstance().print("nextChannel");
    }

    @Override
    public void preChannel() {
        Sysout.getInstance().print("preChannel");
    }

    @Override
    public void turnUp() {
        Sysout.getInstance().print("turnUp");
    }

    @Override
    public void turnDown() {
        Sysout.getInstance().print("turnDown");
    }
}
