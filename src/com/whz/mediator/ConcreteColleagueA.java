package com.whz.mediator;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/26 21:59
 * <p>
 * 描述：
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        Sysout.getInstance().print("ConcreteColleagueA 将信息递交给中介者处理");
    }
}
