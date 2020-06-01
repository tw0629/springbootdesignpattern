package com.tian.designpattern.singletonPattern.demo_sluggard;

/**
 * @author David Tian
 * @since 2019-07-08
 *
 * 懒汉式-1
 * 线程不安全的懒汉 - 多线程不可用
 *
 * 优点：达到了Lazy Loading的效果
 * 缺点：只有在单线程下能保证只有一个实例，多线程下有创建多个实例的风险
 */
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
        System.out.println("枚举单例-Singleton 构造函数初始化 init");
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            System.out.println("进来了");
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    //自定义方法
    public void anything(){
        System.out.println("anything 方法调用了！");
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.anything();
        Singleton instance2 = Singleton.getInstance();
        instance2.anything();
        Singleton instance3 = Singleton.getInstance();
        instance3.anything();
        Singleton instance4 = Singleton.getInstance();
        instance4.anything();
    }
}
