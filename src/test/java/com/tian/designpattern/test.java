package com.tian.designpattern;

import com.tian.designpattern.singletonPattern.demo_other.SingletonEnum;
import org.junit.Test;

/**
 * @author David Tian
 * @since 2019-07-08
 */
public class test {

    @Test
    public void test(){
        System.out.println("======="+ SingletonEnum.getInstance());

        System.out.println("======="+ SingletonEnum.INSTANCE);

        SingletonEnum a = SingletonEnum.INSTANCE;
        System.out.println("======="+ a);


    }
}
