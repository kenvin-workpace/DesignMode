package com.whz.duty.simple3;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 14:58
 * <p>
 * 描述：
 */
public class Group extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    protected void handle(int money) {
        Sysout.getInstance().print("组长审批了" + money + "元");
    }
}
