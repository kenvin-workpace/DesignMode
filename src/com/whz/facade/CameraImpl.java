package com.whz.facade;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/30 10:12
 * <p>
 * 描述：
 */
public class CameraImpl implements ICamera {
    @Override
    public void open() {
        Sysout.getInstance().print("打开相机");
    }

    @Override
    public void takePicture() {
        Sysout.getInstance().print("拍照");
    }

    @Override
    public void close() {
        Sysout.getInstance().print("关闭相机");
    }
}
