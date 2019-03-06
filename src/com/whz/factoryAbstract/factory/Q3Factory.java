package com.whz.factoryAbstract.factory;

import com.whz.factoryAbstract.brake.Ibrake;
import com.whz.factoryAbstract.brake.NormalBrake;
import com.whz.factoryAbstract.engine.IEngine;
import com.whz.factoryAbstract.engine.NormalEngine;
import com.whz.factoryAbstract.tire.ITire;
import com.whz.factoryAbstract.tire.NormalTire;

/**
 * Created by kevin on 2018/4/17 22:55
 * <p>
 * 描述：
 */
public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public Ibrake createBrake() {
        return new NormalBrake();
    }

    @Override
    public IEngine createEngine() {
        return new NormalEngine();
    }
}
