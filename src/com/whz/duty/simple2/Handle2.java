package com.whz.duty.simple2;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 14:41
 * <p>
 * 描述：
 */
public class Handle2 extends AbstractHandler {
    @Override
    public int getHandleLevel() {
        return 2;
    }

    @Override
    public void handle(AbstractRequest request) {
        Sysout.getInstance().print("Handle2  handle request: "+request.getRequestLevel());
    }
}
