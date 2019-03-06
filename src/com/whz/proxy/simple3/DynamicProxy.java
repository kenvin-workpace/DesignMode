package com.whz.proxy.simple3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by kevin on 2018/4/26 23:11
 * <p>
 * 描述：
 */
public class DynamicProxy implements InvocationHandler {
    //被代理类的引用类
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理类对象的方法
        Object result = method.invoke(obj, args);
        return result;
    }
}
