package com.whz.duty.simple1;

/**
 * Created by kevin on 2018/4/22 14:02
 * <p>
 * 描述：
 */
public abstract class Handler {

    public Handler successor;

    public abstract void handRequest(String str);
}
