package com.whz.template;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/25 22:22
 * <p>
 * 描述：
 */
public class MilitaryComputer extends AbstractComputer {
    @Override
    protected void login() {
        Sysout.getInstance().print("军方电脑，需验证指纹，登录系统");
    }
}
