package com.tian.designcode.abstractClass_Impl_Interface.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-01 15:47
 */
public abstract class A_TestAbstractClass implements A_TestInterface{

    public void test1(){
        // default
        testID();
        // statis
        A_TestInterface.testIS();

    }

    public void test2(){};

    public abstract void testA();

    //重新实现
    @Override
    public void testI1(){


    }



}
