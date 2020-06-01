package com.tian.designpattern.adapterPattern.demo1;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 11:13
 */
public class AdapterClient {

    public static void main(String[] args) {

        System.out.println("==========对比=============");

        System.out.println("===> 一般接口 直接调用接口的方式：<===");
        ITarget target = new ConcreteTarget();
        target.request();

        System.out.println("                        ");

        System.out.println("===> 适配器模式 调用接口的方式：<===");
        ITarget adapter = new Adapter();
        //Adapter内部已经调用了Adaptee.onRequest()
        adapter.request();

        System.out.println("========================");


    }

}
