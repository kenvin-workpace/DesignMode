package com.whz.duty.simple3;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 14:59
 * <p>
 * 描述：
 */
public class Director extends Leader {
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    protected void handle(int money) {
        Sysout.getInstance().print("主管审批了" + money + "元");
    }
}
