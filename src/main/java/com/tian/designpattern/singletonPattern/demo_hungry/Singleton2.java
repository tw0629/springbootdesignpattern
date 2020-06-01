package com.tian.designpattern.singletonPattern.demo_hungry;

/**
 * @author David Tian
 * @since 2019-07-08
 *
 *
 * 饿汉式-2
 * 静态代码块 饿汉 可用
 *
 * 优点：无线程同步问题
 * 缺点：类装载时创建实例，无Lazy Loading。实例一直未被使用时，会浪费资源
 *
 */
public class Singleton2 {

    private static Singleton2 INSTANCE;

    static{
        INSTANCE = new Singleton2();
    }

    private Singleton2() {};

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
