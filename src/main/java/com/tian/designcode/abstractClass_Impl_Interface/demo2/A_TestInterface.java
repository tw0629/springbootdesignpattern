package com.tian.designcode.abstractClass_Impl_Interface.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-01 16:36
 */
public interface A_TestInterface {

    void testI1();

    void testI2();

    // 错误的
    //void test13(){}


    /**
     * jdk1.8之后可以用static和default去修饰方法并且实现
     */
    default Object testID(){

        return null;
    }

    static Object testIS(){

        return null;
    }


}
