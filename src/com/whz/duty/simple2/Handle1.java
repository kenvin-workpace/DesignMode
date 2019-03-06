package com.whz.duty.simple2;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 14:40
 * <p>
 * 描述：
 */
public class Handle1 extends AbstractHandler {
    @Override
    public int getHandleLevel() {
        return 1;
    }

    @Override
    public void handle(AbstractRequest request) {
        Sysout.getInstance().print("Handle1  handle request: "+request.getRequestLevel());
    }
}
