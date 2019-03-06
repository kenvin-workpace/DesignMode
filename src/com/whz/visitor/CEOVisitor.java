package com.whz.visitor;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/25 23:06
 * <p>
 * 描述：
 */
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        Sysout.getInstance().print("工程师：" + engineer.name + " kpi：" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        Sysout.getInstance().print("经理：" + manager.name + " kpi：" + manager.kpi);
    }
}
