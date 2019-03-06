package com.whz.factoryAbstract.engine;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/17 22:52
 * <p>
 * 描述：
 */
public class SUVEngine extends IEngine {
    @Override
    public void engine() {
        Sysout.getInstance().print("suv engine");
    }
}
