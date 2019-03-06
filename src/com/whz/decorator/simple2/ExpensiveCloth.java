package com.whz.decorator.simple2;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/29 21:55
 * <p>
 * 描述：
 */
public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(IPerson person) {
        super(person);
    }

    @Override
    public void dressed() {
        super.dressed();

        dressJean();
        dressShirt();
        dressLeather();
    }

    private void dressShirt() {
        Sysout.getInstance().print("Shirt");
    }

    private void dressLeather() {
        Sysout.getInstance().print("Leather");
    }

    private void dressJean() {
        Sysout.getInstance().print("Jean");
    }
}
