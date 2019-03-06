package com.whz.facade;

/**
 * Created by kevin on 2018/4/30 10:13
 * <p>
 * 描述：
 */
public class MobileApi {
    private IPhone iPhone = new PhoneImpl();
    private ICamera camera = new CameraImpl();

    public void dail() {
        iPhone.dail();
    }

    public void videoChat() {
        camera.open();
        iPhone.dail();
    }

    public void hangup() {
        iPhone.hangup();
    }

    public void takePicture() {
        camera.open();
        camera.takePicture();
    }

    public void closeCamera() {
        camera.close();
    }
}
