package com.whz.visitor;

import java.util.Random;

/**
 * Created by kevin on 2018/4/25 23:04
 * <p>
 * 描述：
 */
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(100);
    }
}
