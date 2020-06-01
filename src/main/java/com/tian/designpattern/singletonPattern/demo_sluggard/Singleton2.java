package com.tian.designpattern.singletonPattern.demo_sluggard;

/**
 * @author David Tian
 * @since 2019-07-08
 *
 * 懒汉式-2
 * 同步方法下的懒汉 - 可用，不推荐
 *
 * 优点：不需要在每次调用时加锁，效率比上一个高
 * 缺点：虽然使用了synchronized，但本质上是线程不安全的。
 *
 */
public class Singleton2 {

    private static Singleton2 INSTANCE;

    private Singleton2() {};

    public static synchronized Singleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

}
