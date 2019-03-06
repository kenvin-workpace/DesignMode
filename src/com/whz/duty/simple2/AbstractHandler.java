package com.whz.duty.simple2;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 14:29
 * <p>
 * 描述：
 */
public abstract class AbstractHandler {
    public AbstractHandler mNexthandler;

    public final void handleRequest(AbstractRequest request) {
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (mNexthandler != null) {
                mNexthandler.handleRequest(request);
            }else {
                Sysout.getInstance().print("All of handler can not handle the request");
            }
        }
    }

    public abstract int getHandleLevel();

    public abstract void handle(AbstractRequest request);
}
