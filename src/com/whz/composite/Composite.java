package com.whz.composite;

import com.whz.Sysout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin on 2018/4/29 20:36
 * <p>
 * 描述：
 */
public class Composite extends Component {

    private List<Component> composites = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        Sysout.getInstance().print(name);
        if (null != composites) {
            for (Component component :composites){
                component.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        composites.add(child);
    }

    @Override
    public void removeChild(Component child) {
        composites.remove(child);
    }

    @Override
    public Component getChild(int index) {
        return composites.get(index);
    }
}
