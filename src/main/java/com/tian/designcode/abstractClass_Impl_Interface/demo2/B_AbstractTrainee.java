package com.tian.designcode.abstractClass_Impl_Interface.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-01 13:22
 */
public abstract class B_AbstractTrainee implements B_Trainee {

    @Override
    public void sing(){
        System.out.println("唱,");
    }

    @Override
    public void jump(){
        System.out.println("跳,");
    }

    @Override
    public void rap() {
        System.out.println("rap，");
    }

    @Override
    public abstract void playBasketball();


    @Override
    public void test1(){};

    @Override
    public abstract void test2();

}
