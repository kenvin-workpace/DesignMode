package com.whz.duty.simple1;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 14:06
 * <p>
 * 描述：
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handRequest(String str) {
        if (str.contains("ConcreteHandler2")){
            Sysout.getInstance().print(str);
            return;
        }else {
            successor.handRequest(str);
        }
    }
}
