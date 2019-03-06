package com.whz.visitor;

/**
 * Created by kevin on 2018/4/25 22:58
 * <p>
 * 描述：
 */
public interface Visitor {

    public void visit(Engineer engineer);

    public void visit(Manager manager);
}
