package com.whz.duty.simple2;

/**
 * Created by kevin on 2018/4/22 14:40
 * <p>
 * 描述：
 */
public class Request3 extends AbstractRequest {
    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}
