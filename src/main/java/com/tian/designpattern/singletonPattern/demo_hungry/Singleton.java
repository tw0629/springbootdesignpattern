package com.tian.designpattern.singletonPattern.demo_hungry;

/**
 * @author David Tian
 * @since 2019-07-08
 *
 *
 * 饿汉式-1
 * 静态常量 饿汉 - 推荐
 *
 * 优点：实现简单，无线程同步问题
 * 缺点：在类装载时完成实例化。若该实例一直未被使用，则会造成资源浪费
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {};

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
