package com.whz.singleton;

/**
 * Created by kevin on 2018/4/16 23:10
 * <p>
 * 描述：单例模式 饿汉式
 * <p>
 * 优点：在声明的时候，已经初始化了
 */
public class Singleton1 {

    private static final Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }

    public String test() {
        return "Singleton1";
    }

}
