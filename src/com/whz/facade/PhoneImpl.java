package com.whz.facade;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/30 10:10
 * <p>
 * 描述：
 */
public class PhoneImpl implements IPhone {
    @Override
    public void dail() {
        Sysout.getInstance().print("打电话");
    }

    @Override
    public void hangup() {
        Sysout.getInstance().print("挂断");
    }
}
