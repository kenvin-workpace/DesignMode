package com.whz.template;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/25 22:20
 * <p>
 * 描述：
 */
public class CoderCoputer extends AbstractComputer {
    @Override
    protected void login() {
        Sysout.getInstance().print("程序员电脑，需验证账号密码，登录系统");
    }
}
