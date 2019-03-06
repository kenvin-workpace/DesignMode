package com.whz.state;

/**
 * Created by kevin on 2018/4/18 22:04
 * <p>
 * 描述：
 */
public interface ITvState {
    public void nextChannel();
    public void preChannel();

    public void turnUp();
    public void turnDown();
}
