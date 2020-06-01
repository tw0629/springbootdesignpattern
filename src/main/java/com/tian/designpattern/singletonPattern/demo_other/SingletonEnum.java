package com.tian.designpattern.singletonPattern.demo_other;

/**
 * @author David Tian
 * @since 2019-07-08
 *
 *
 * 枚举 强烈推荐
 *
 * 优点：枚举本身是线程安全的，且能防止通过反射和反序列化创建多实例。
 * 缺点：使用的是枚举，而非类。
 *
 * 这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，
 * 而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，不过，个人认为由于1.5中才加入enum特性，用这种方式写不免让人感觉生疏，
 * 在实际工作中，我也很少看见有人这么写过。
 *
 */
public enum SingletonEnum {

    INSTANCE;

    public void whatSoEverMethod() { }

    // 该方法非必须，只是为了保证与其它方案一样使用静态方法得到实例
    public static SingletonEnum getInstance() {
        return INSTANCE;
    }



}
