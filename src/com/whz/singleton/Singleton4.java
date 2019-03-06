package com.whz.singleton;

/**
 * Created by kevin on 2018/4/16 23:36
 * <p>
 * 描述：静态内部类
 * <p>
 * 优点：1.调用时才实例化;2.保证线程安全
 */
public class Singleton4 {

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return Singleton4Holder.instance;
    }

    private static class Singleton4Holder {
        private static final Singleton4 instance = new Singleton4();
    }


    public String test() {
        return "Singleton4";
    }
}
