package com.whz.adapter.simple1;

/**
 * Created by kevin on 2018/4/29 21:08
 * <p>
 * 描述：
 */
public class VoltAdapter extends Volt220 implements IFiveVolt {
    @Override
    public int getVolt5() {
        return getVolot220() == 220 ? 5 : 5;
    }
}
