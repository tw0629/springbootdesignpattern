package com.tian.designcode.abstractClass_Impl_Interface.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-01 17:48
 */
public class A11 extends A1{

    @Override
    public void testA1(){
        int i = super.i;
        int a = A1.a;
    }

    public void testA11(){
        super.testA1();
    }
}
