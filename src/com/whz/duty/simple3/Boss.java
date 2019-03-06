package com.whz.duty.simple3;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 15:00
 * <p>
 * 描述：
 */
public class Boss extends Leader {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    protected void handle(int money) {
        Sysout.getInstance().print("老板审批了" + money + "元");
    }
}
