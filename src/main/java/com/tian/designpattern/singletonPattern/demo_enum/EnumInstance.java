package com.tian.designpattern.singletonPattern.demo_enum;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author David Tian
 * @since 2019-07-09
 *
 * 一
 * https://blog.csdn.net/wenlong_l/article/details/82817412
 * 设计模式之单例模式七（使用枚举类的最佳实践）
 *
 * 二
 * 再结合 原文：https://blog.csdn.net/qq_36642340/article/details/82055786
 * 为什么最好的单例模式是枚举单例：
 *
 * 1.书写简单，仅仅5行代码就能实现单例模式。
 *
 * 2.枚举类能防止破坏单例模式。
 *
 * 2.1.枚举类能防止利用反射方式获取枚举对象
 * 原因：调用反射newInstance方法时会检查是否为枚举类，如果是将报错，错误如下：
 * Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
 *
 * 2.2.枚举类能防止使用序列化与反序列化获取新的枚举对象
 * 原因：在序列化的时候Java仅仅是将枚举对象的name属性输出到结果中，反序列化的时候则是通过java.lang.Enum的valueOf方法来根据名字查找枚举对象。同时，编译器是不允许任何对这种序列化机制的定制的，因此禁用了writeObject、readObject、readObjectNoData、writeReplace和readResolve等方法。
 *
 *
 *
 */
public enum  EnumInstance {

    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }


    /**
     * 在newInstance方法中对构造的对象的class信息进行了判断，如果构造的是枚举类，则抛出异常，
     * 可见我们不能通过反射构造枚举类型的实例，这样就天然的使得枚举类实现的单例模式避免了反射攻击。
     *
     * @throws Exception
     */
    @Test
    public void test() throws Exception {
        //使用专用的访问控制点构造单例
        EnumInstance instance = EnumInstance.getInstance();

        //使用反射的方式进行构造
        Class enumInstanceClass = EnumInstance.class;
        Constructor declaredConstructor = enumInstanceClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumInstance newInstance = (EnumInstance)declaredConstructor.newInstance("tian", "18");

        System.out.println("instance ======>"+instance);
        System.out.println("newInstance ======>"+instance);
        System.out.println("instance == newInstance ======>"+(instance==newInstance));
    }

    @Test
    public void test2() throws Exception {
        //使用专用的访问控制点构造单例
        EnumInstance instance = EnumInstance.getInstance();
        instance.setObject(new Object());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/tianwei/tree2.txt"));
        oos.writeObject(instance);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/tianwei/tree2.txt"));
        EnumInstance newInstance = (EnumInstance)ois.readObject();

        System.out.println("instance ======>"+instance);
        System.out.println("newInstance ======>"+instance);
        System.out.println("instance == newInstance ======>"+(instance==newInstance));
    }

}
