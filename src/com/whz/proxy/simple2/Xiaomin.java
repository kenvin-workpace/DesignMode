package com.whz.proxy.simple2;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/26 23:05
 * <p>
 * 描述：
 */
public class Xiaomin implements ILawsuit {
    @Override
    public void submit() {
        Sysout.getInstance().print("老板欠工资，特此申请仲裁！");
    }

    @Override
    public void burden() {
        Sysout.getInstance().print("这是合同以及一年银行流水！");
    }

    @Override
    public void defend() {
        Sysout.getInstance().print("证据确凿，不需要再说什么了！");
    }

    @Override
    public void finish() {
        Sysout.getInstance().print("诉讼成功，判决老板即日起七天内结算工资！");
    }
}
