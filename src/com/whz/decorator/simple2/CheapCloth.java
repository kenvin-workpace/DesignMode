package com.whz.decorator.simple2;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/29 21:58
 * <p>
 * 描述：
 */
public class CheapCloth extends PersonCloth {

    public CheapCloth(IPerson person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShort();
    }

    private void dressShort() {
        Sysout.getInstance().print("short");
    }
}
