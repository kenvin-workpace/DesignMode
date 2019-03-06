package com.whz.duty.simple1;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 14:04
 * <p>
 * 描述：
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public void handRequest(String str) {
        if (str.contains("ConcreteHandler1")){
            Sysout.getInstance().print(str);
            return;
        }else {
            successor.handRequest(str);
        }
    }
}
