package com.tian.designcode.abstractClass_Impl_Interface.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-01 17:49
 */
public class A111 extends A11{

    @Override
    public void testA1(){

    }

    public void demo(){
        this.testA1();
        super.testA1();
    }


    // 相当于调用 父类的父类的testA1方法
    public void demo2(){
        super.testA11();
    }
}
