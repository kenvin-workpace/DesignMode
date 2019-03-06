package com.whz.singleton;

/**
 * Created by kevin on 2018/4/16 23:41
 * <p>
 * 描述：枚举单例
 * <p>
 * 优点：1.枚举默认线程安全且单例子；2.可杜绝反序列化
 */
public enum Singleton5 {
    getInstance;

    public String test() {
        return "Singleton5";
    }
}
