package com.whz.adapter.simple2;

import com.whz.adapter.simple1.IFiveVolt;
import com.whz.adapter.simple1.Volt220;

/**
 * Created by kevin on 2018/4/29 21:16
 * <p>
 * 描述：
 */
public class VoltAdapter2 implements IFiveVolt {
    private Volt220 volt220;

    public VoltAdapter2(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        return getVolt220() == 220 ? 5 : 5;
    }

    public int getVolt220() {
        return volt220.getVolot220();
    }
}
