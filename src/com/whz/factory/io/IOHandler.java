package com.whz.factory.io;

/**
 * Created by kevin on 2018/4/17 22:19
 * <p>
 * 描述：
 */
public abstract class IOHandler {

    //增加id
    public abstract void add(int id);

    //删除id
    public abstract boolean delete(int id);

    //更新id
    public abstract boolean update(int id);

    //查询id
    public abstract String query(int id);
}
