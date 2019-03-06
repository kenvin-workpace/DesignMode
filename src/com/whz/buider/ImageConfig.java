package com.whz.buider;

/**
 * Created by kevin on 2018/4/17 21:00
 * <p>
 * 描述：
 */
public class ImageConfig {
    private int width;
    private int heigth;
    private String name;

    private ImageConfig(){}

    public static ImageConfig builder(){
        return new ImageConfig();
    }

    public ImageConfig setWidth(int width) {
        this.width = width;
        return this;
    }

    public ImageConfig setHeigth(int heigth) {
        this.heigth = heigth;
        return this;
    }

    public ImageConfig setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "ImageConfig{" +
                "width=" + width +
                ", heigth=" + heigth +
                ", name='" + name + '\'' +
                '}';
    }
}
