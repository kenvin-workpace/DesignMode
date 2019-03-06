package com.whz.visitor;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/25 23:07
 * <p>
 * 描述：
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        Sysout.getInstance().print("工程师：" + engineer.name + " 代码数：" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        Sysout.getInstance().print("经理：" + manager.name + " 产品数：" + manager.getProducts());
    }
}
