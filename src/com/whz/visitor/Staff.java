package com.whz.visitor;

import java.util.Random;

/**
 * Created by kevin on 2018/4/25 22:59
 * <p>
 * 描述：
 */
public abstract class Staff {
    //员工姓名
    public String name;
    //员工kpi
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    //接受Visitor的访问
    public abstract void accept(Visitor visitor);
}
