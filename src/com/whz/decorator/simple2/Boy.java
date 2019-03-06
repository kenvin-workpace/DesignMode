package com.whz.decorator.simple2;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/29 21:54
 * <p>
 * 描述：
 */
public class Boy extends IPerson {
    @Override
    public void dressed() {
        Sysout.getInstance().print("内衣");
    }
}
