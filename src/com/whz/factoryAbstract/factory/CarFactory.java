package com.whz.factoryAbstract.factory;

import com.whz.factoryAbstract.brake.Ibrake;
import com.whz.factoryAbstract.engine.IEngine;
import com.whz.factoryAbstract.tire.ITire;

/**
 * Created by kevin on 2018/4/17 22:54
 * <p>
 * 描述：
 */
public abstract class CarFactory {

    public abstract ITire createTire();

    public abstract Ibrake createBrake();

    public abstract IEngine createEngine();
}
