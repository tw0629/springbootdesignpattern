package com.tian.designcode.abstractClass_Impl_Interface.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-01 15:55
 */
public class A_TestAbstractClass_ExtendClass extends A_TestAbstractClass {

    @Override
    public void test1(){

    }


    public void s(){
        super.test1();
        super.test2();

        test1();
        this.test1();

        // default
        testID();
        // statis
        A_TestInterface.testIS();


        this.testID();
        super.testID();
        A_TestInterface.testIS();

    }


    // 再次重新实现
    @Override
    public void testI1(){

    }


    @Override
    public void testI2() {

    }


    /**
     *  jdk1.8之后可以用static和default去修饰方法并且实现
     */
    /**
     * default()方法可以重载
     */
    @Override
    public Object testID() {
        return null;
    }
    /**
     *  static()方法不能重载
     *  下面是错误
     */
    /*@Override
    static Object testIS(){

        return null;
    }*/




    public void s2(){

        super.testI1();
        this.testI1();

        // error
        //super.testI2();
    }


    @Override
    public void testA() {

    }

}
