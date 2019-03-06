package com.whz.duty.simple2;

/**
 * Created by kevin on 2018/4/22 14:26
 * <p>
 * 描述：
 */
public abstract class AbstractRequest {
    private Object object;

    public AbstractRequest(Object obj) {
        this.object = obj;
    }

    public Object getObject() {
        return object;
    }

    public abstract int getRequestLevel();
}
