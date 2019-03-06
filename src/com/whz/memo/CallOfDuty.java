package com.whz.memo;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/22 17:21
 * <p>
 * 描述：
 */
public class CallOfDuty {
    private int mCheckPoint;
    private int mliefValue = 100;
    private String mWeapon = "Gun";

    public void play() {
        Sysout.getInstance().print("玩之前：mliefValue:" + mliefValue + " ,mCheckPoint:" + mCheckPoint);
        mliefValue -= 10;
        mCheckPoint++;
        Sysout.getInstance().print("玩之后：mliefValue:" + mliefValue + " ,mCheckPoint:" + mCheckPoint);
    }

    public void quite() {
        Sysout.getInstance().print("quite game");
    }

    public void restore(Memoto memoto) {
        this.mCheckPoint = memoto.mCheckPoint;
        this.mliefValue = memoto.mliefValue;
        this.mWeapon = memoto.mWeapon;
        Sysout.getInstance().print("恢复后：mliefValue:" + mliefValue + " ,mCheckPoint:" + mCheckPoint);
    }

    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mCheckPoint = mCheckPoint;
        memoto.mliefValue = mliefValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }
}

