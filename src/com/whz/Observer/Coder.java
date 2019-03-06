package com.whz.Observer;

import com.whz.Sysout;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by kevin on 2018/4/22 16:34
 * <p>
 * 描述：
 */
public class Coder implements Observer {
    private String mName;

    public Coder(String name) {
        this.mName = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Sysout.getInstance().print("Hi, " + mName + " ,DevTechFrontier 更新啦，内容：" + arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
