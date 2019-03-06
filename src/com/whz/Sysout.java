package com.whz;

/**
 * Created by kevin on 2018/4/17 21:19
 * <p>
 * 描述：
 */
public class Sysout {

    private Sysout() {
    }

    public static Sysout getInstance() {
        return LogMsgHolder.instance;
    }

    private static class LogMsgHolder {
        private static final Sysout instance = new Sysout();
    }

    /**
     * 打印字符串
     */
    public void print(Object str) {
        System.out.println(str);
    }

}
