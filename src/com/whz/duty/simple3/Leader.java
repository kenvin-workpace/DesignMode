package com.whz.duty.simple3;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 14:55
 * <p>
 * 描述：
 */
public abstract class Leader {
    public Leader mNextLeader;

    public void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != mNextLeader) {
                mNextLeader.handleRequest(money);
            } else {
                Sysout.getInstance().print("Sorry,your money can't handle");
            }
        }
    }

    public abstract int limit();

    protected abstract void handle(int money);
}
