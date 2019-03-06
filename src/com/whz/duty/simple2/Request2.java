package com.whz.duty.simple2;

/**
 * Created by kevin on 2018/4/22 14:39
 * <p>
 * 描述：
 */
public class Request2 extends AbstractRequest {
    public Request2(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 2;
    }
}
