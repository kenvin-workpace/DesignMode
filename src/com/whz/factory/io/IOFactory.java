package com.whz.factory.io;

/**
 * Created by kevin on 2018/4/17 22:22
 * <p>
 * 描述：
 */
public class IOFactory {

    public <T extends IOHandler> T createIOHandler(Class<T> clz) {
        try {
            IOHandler handler = (IOHandler) Class.forName(clz.getName()).newInstance();
            return (T) handler;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
