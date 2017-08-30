package com.youmeek.ssm.module.user.controller;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lilixin
 * @description
 * @create 2017-08-29 4:21 PM
 **/
public class MyProxyInvocationHandler implements InvocationHandler{

    private Object target;

    public MyProxyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke begin");
        Object invoke = method.invoke(target,args);
        System.out.println("invoke end");
        return invoke;
    }
}
