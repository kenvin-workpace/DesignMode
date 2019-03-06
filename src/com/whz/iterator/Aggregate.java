package com.whz.iterator;

/**
 * Created by kevin on 2018/4/24 22:36
 * <p>
 * 描述：
 */
public interface Aggregate<T> {
    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();
}
