package com.whz.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 2018/4/24 22:37
 * <p>
 * 描述：
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> lists = new ArrayList<>();

    @Override
    public void add(T obj) {
        lists.add(obj);
    }

    @Override
    public void remove(T obj) {
        lists.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(lists);
    }
}
