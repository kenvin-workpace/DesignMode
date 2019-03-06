package com.whz.duty.simple2;

/**
 * Created by kevin on 2018/4/22 14:38
 * <p>
 * 描述：
 */
public class Request1 extends AbstractRequest {
    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
