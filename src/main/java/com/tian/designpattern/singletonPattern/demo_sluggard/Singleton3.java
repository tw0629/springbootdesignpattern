package com.tian.designpattern.singletonPattern.demo_sluggard;

/**
 * @author David Tian
 * @since 2019-07-08
 *
 * 懒汉式-3
 * 双重检查（Double Check）下的懒汉 - 推荐!!!!!!
 *
 * 优点：使用了双重检查，避免了线程不安全，同时也避免了不必要的锁开销。
 * 缺点：NA
 *
 * 注：
 * 但是这里的synchronized已经保证了INSTANCE写操作对其它线程读操作的可见性。具体原理请参考《Java进阶（二）当我们说线程安全时，到底在说什么》
 * 使用volatile关键字的目的不是保证可见性（synchronized已经保证了可见性），而是为了保证顺序性。
 * 具体来说，INSTANCE = new Singleton()不是原子操作，实际上被拆分为了三步：1) 分配内存；2) 初始化对象；3) 将INSTANCE指向分配的对象内存地址。
 * 如果没有volatile，可能会发生指令重排，使得INSTANCE先指向内存地址，而对象尚未初始化，其它线程直接使用INSTANCE引用进行对象操作时出错。
 * 详细原理可参见《双重检查锁定与延迟初始化》
 *
 */
public class Singleton3 {

    private static volatile Singleton3 INSTANCE;

    private Singleton3() {};

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            synchronized(Singleton3.class){
                if(INSTANCE == null) {
                    INSTANCE = new Singleton3();
                }
            }
        }
        return INSTANCE;
    }
}
