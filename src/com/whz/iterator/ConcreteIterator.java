package com.whz.iterator;

import java.util.List;

/**
 * Created by kevin on 2018/4/24 22:33
 * <p>
 * 描述：
 */
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> lists;
    private int cursor = 0;

    public ConcreteIterator(List<T> lists){
        this.lists = lists;
    }

    @Override
    public boolean hasNext() {
        return cursor != lists.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (hasNext()) {
            obj = lists.get(cursor++);
        }
        return obj;
    }
}
