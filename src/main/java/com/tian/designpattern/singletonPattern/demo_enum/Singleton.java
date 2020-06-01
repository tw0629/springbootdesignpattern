package com.tian.designpattern.singletonPattern.demo_enum;


import org.junit.Test;

/**
 * @author David Tian
 * @since 2019-07-09
 *
 *
 * 为什么最好的单例模式是枚举单例：
 *
 * 1.书写简单，仅仅5行代码就能实现单例模式。
 *
 * 2.枚举类能防止破坏单例模式。
 *
 * 2.1.枚举类能防止利用反射方式获取枚举对象
 *
 * 原因：调用反射newInstance方法时会检查是否为枚举类，如果是将报错，错误如下：
 *
 * Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
 * 2.2.枚举类能防止使用序列化与反序列化获取新的枚举对象
 *
 * 原因：在序列化的时候Java仅仅是将枚举对象的name属性输出到结果中，反序列化的时候则是通过java.lang.Enum的valueOf方法来根据名字查找枚举对象。同时，编译器是不允许任何对这种序列化机制的定制的，因此禁用了writeObject、readObject、readObjectNoData、writeReplace和readResolve等方法。
 * ---------------------
 *
 * 原文：https://blog.csdn.net/qq_36642340/article/details/82055786
 *
 *
 */
public enum Singleton {

    INSTANCE;

    public void whateverMethod() {
    }

    //测试上面的这五行
    @Test
    public void test(){
        Singleton s = Singleton.INSTANCE;
        System.out.println("=====>"+s);
    }
}
