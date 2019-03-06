package com.whz.prototype;

import com.whz.Sysout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 2018/4/17 21:15
 * <p>
 * 描述：
 */
public class WordDoc implements Cloneable {
    private String text;
    private List<String> imags = new ArrayList<>();

    public WordDoc() {
        System.out.println("WordDoc构造函数");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImags(String imags) {
        this.imags.add(imags);
    }

    /**
     * 该方法是object方法，且必须实现Cloneable接口
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            WordDoc doc = (WordDoc) super.clone();
            doc.text = this.text;
            doc.imags = this.imags;
            return doc;
        } catch (Exception e) {

        }
        return null;
    }

    public void showDoc() {
        Sysout.getInstance().print("text:" + text);
        for (String img : imags) {
            Sysout.getInstance().print("img:" + img);
        }
        Sysout.getInstance().print("\n");
    }
}
