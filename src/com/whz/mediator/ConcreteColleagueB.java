package com.whz.mediator;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/26 22:00
 * <p>
 * 描述：
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        Sysout.getInstance().print("ConcreteColleagueB 将信息递交给中介者处理");
    }
}
