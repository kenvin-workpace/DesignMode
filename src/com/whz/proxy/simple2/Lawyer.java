package com.whz.proxy.simple2;

/**
 * Created by kevin on 2018/4/26 23:07
 * <p>
 * 描述：
 */
public class Lawyer implements ILawsuit {

    private ILawsuit lawsuit;

    public Lawyer(ILawsuit lawsuit) {
        this.lawsuit = lawsuit;
    }

    @Override
    public void submit() {
        lawsuit.submit();
    }

    @Override
    public void burden() {
        lawsuit.burden();
    }

    @Override
    public void defend() {
        lawsuit.defend();
    }

    @Override
    public void finish() {
        lawsuit.finish();
    }
}
