package com.whz.factory.car;

/**
 * Created by kevin on 2018/4/17 21:55
 * <p>
 * 描述：
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
