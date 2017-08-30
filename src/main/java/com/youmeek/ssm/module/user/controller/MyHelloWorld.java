package com.youmeek.ssm.module.user.controller;

/**
 * @author lilixin
 * @description
 * @create 2017-08-29 4:46 PM
 **/
public class MyHelloWorld implements HelloWorld {
    @Override
    public void sayHello(String name) {
        System.out.println("hello "+name);
    }
}
