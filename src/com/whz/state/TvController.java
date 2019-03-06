package com.whz.state;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/18 22:09
 * <p>
 * 描述：
 */
public class TvController implements IPowerController {

    private ITvState mTvState;

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        Sysout.getInstance().print("powerOn");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        Sysout.getInstance().print("powerOff");
    }

    public void setTvState(ITvState state) {
        this.mTvState = state;
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void preChannel() {
        mTvState.preChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
