package com.whz.singleton;

/**
 * Created by kevin on 2018/4/16 23:29
 * <p>
 * 描述：Double Check Lock (DCL)
 * <p>
 * 优点：1.调用时才实例化;2.保证了线程安全
 * 缺点：1.在JDK1.5之前Java内存模型偶尔会失败，之后需添加volatile关键字，但会影响性能
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

    public String test(){
        return "Singleton3";
    }
}
