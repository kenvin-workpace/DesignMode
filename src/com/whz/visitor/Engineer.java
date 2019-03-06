package com.whz.visitor;

import java.util.Random;

/**
 * Created by kevin on 2018/4/25 23:01
 * <p>
 * 描述：
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //工程这一年写的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
