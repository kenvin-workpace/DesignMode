package com.whz.proxy.simple1;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/26 22:59
 * <p>
 * 描述：
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        Sysout.getInstance().print("调用了被代理方法");
    }
}
