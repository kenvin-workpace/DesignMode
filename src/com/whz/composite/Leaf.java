package com.whz.composite;

import com.whz.Sysout;

/**
 * Created by kevin on 2018/4/29 20:40
 * <p>
 * 描述：
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Sysout.getInstance().print(name);
    }

    @Override
    public void addChild(Component child) {
        throw new UnsupportedOperationException("addChild 叶子节点没有子节点");
    }

    @Override
    public void removeChild(Component child) {
        throw new UnsupportedOperationException("removeChild 叶子节点没有子节点");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("getChild 叶子节点没有子节点");
    }
}
