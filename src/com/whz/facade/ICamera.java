package com.whz.facade;

/**
 * Created by kevin on 2018/4/30 10:11
 * <p>
 * 描述：
 */
public interface ICamera {
    //打开相机
    void open();

    //拍照
    void takePicture();

    //关闭相机
    void close();
}
