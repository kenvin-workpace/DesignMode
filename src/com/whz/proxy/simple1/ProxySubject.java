package com.whz.proxy.simple1;

/**
 * Created by kevin on 2018/4/26 23:00
 * <p>
 * 描述：
 */
public class ProxySubject extends Subject {
    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
