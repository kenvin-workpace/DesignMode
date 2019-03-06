package com.whz.factory.car;

/**
 * Created by kevin on 2018/4/17 22:01
 * <p>
 * 描述：
 */
public class AudiCarFactory extends AudiFactory {
    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {
        try {
            AudiCar car = (AudiCar) Class.forName(clz.getName()).newInstance();
            return (T) car;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
