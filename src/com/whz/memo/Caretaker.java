package com.whz.memo;

/**
 * Created by kevin on 2018/4/22 17:31
 * <p>
 * 描述：
 */
public class Caretaker {
    private Memoto memoto;

    public void archive(Memoto memoto) {
        this.memoto = memoto;
    }

    public Memoto getmemoto() {
        return memoto;
    }
}
