package com.tian.designpattern.singletonPattern.demo_other;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @author David Tian
 * @since 2019-07-08
 *
 *
 * 静态内部类 推荐
 *
 * 优点：无线程同步问题，实现了懒加载（Lazy Loading）。因为只有调用getInstance时才会装载内部类，才会创建实例。
 *      同时因为使用内部类时，先调用内部类的线程会获得类初始化锁，从而保证内部类的初始化（包括实例化它所引用的外部类对象）线程安全。
 *      即使内部类创建外部类的实例Singleton INSTANCE = new Singleton()发生指令重排也不会引起双重检查（Double-Check）下的懒汉模式中提到的问题，
 *      因此无须使用volatile关键字。
 * 缺点：NA
 */
public class Singleton {

    private Singleton() {};

    private static class InnerClass {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return InnerClass.INSTANCE;
    }


}
