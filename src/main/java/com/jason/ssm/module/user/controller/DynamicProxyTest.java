package com.jason.ssm.module.user.controller;

import java.lang.reflect.Proxy;

/**
 * @author lilixin
 * @description 测试类
 * @create 2017-08-29 4:38 PM
 **/
public class DynamicProxyTest {
    public static void main(String[] args) {
        //设置属性值为true 这样就可以把生成的代理类保存到本地
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //创建InvocationHandler
        MyProxyInvocationHandler invocationHandler = new MyProxyInvocationHandler(new MyHelloWorld());
        HelloWorld world = (HelloWorld)Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(), new Class[]{HelloWorld.class}, invocationHandler);
        world.sayHello("LiLiXin");
    }
}
