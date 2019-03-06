package com.whz.Observer;

import java.util.Observable;

/**
 * Created by kevin on 2018/4/22 16:36
 * <p>
 * 描述：
 */
public class DevTechFrontier extends Observable {

    public void postNewPublication(String content) {
        //标示状态或者内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(content);
    }
}
