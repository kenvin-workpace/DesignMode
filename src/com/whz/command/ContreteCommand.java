package com.whz.command;

/**
 * Created by kevin on 2018/4/22 16:01
 * <p>
 * 描述：
 */
public class ContreteCommand implements Command {

    private Receiver mReceiver;

    public ContreteCommand(Receiver receiver) {
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
