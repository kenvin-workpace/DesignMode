package com.whz.factoryAbstract.factory;

import com.whz.factoryAbstract.brake.Ibrake;
import com.whz.factoryAbstract.brake.SUVBrake;
import com.whz.factoryAbstract.engine.IEngine;
import com.whz.factoryAbstract.engine.SUVEngine;
import com.whz.factoryAbstract.tire.ITire;
import com.whz.factoryAbstract.tire.SUVTire;

/**
 * Created by kevin on 2018/4/17 22:56
 * <p>
 * 描述：
 */
public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public Ibrake createBrake() {
        return new SUVBrake();
    }

    @Override
    public IEngine createEngine() {
        return new SUVEngine();
    }
}
