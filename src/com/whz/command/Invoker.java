package com.whz.command;

/**
 * Created by kevin on 2018/4/22 16:03
 * <p>
 * 描述：
 */
public class Invoker {
    private Command mCommand;

    public Invoker(Command command) {
        this.mCommand = command;
    }

    public void action() {
        mCommand.execute();
    }
}
