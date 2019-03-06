package com.whz.template;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/25 22:17
 * <p>
 * 描述：
 */
public abstract class AbstractComputer {

    protected void powerOn(){
        Sysout.getInstance().print("打开电源");
    }

    protected void checkHardWare(){
        Sysout.getInstance().print("检查硬盘");
    }

    protected void loadOs(){
        Sysout.getInstance().print("载入系统");
    }

    protected void login(){
        Sysout.getInstance().print("小白电脑无验证，直接进入系统");
    }

    public final void startUp(){
        Sysout.getInstance().print("--------- start ----------");
        powerOn();
        checkHardWare();
        loadOs();
        login();
        Sysout.getInstance().print("--------- end ------------");
    }
}
