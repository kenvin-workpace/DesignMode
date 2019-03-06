package com.whz.singleton;

/**
 * Created by kevin on 2018/4/16 23:13
 * <p>
 * 描述：单例模式 懒汉式
 * <p>
 * 优点：在调用的时候才初始化
 * 缺点：1.第一次加载时需要实例化，反应稍慢；2.每次调用getInstance都进行同步，造成不必要的同步开销
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public String test() {
        return "Singleton2";
    }
}
