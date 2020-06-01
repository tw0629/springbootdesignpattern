package com.tian.designpattern.singletonPattern.demo_enum;

/**
 * @author David Tian
 * @since 2019-07-09
 *
 *
 * 原文：https://blog.csdn.net/tyn243222791/article/details/77712520
 *
 */
public enum BeanContext {

    Instance;

    private BeanContext() {
        System.out.println("枚举单例-BeanContext 构造函数初始化 init");
    }

    public void print() {

        System.out.println("ffffffffffff");
    }

    //测试
    public static void main(String[] args) {

        BeanContext b1 = BeanContext.Instance;
        b1.print();
        BeanContext b2 = BeanContext.Instance;
        b2.print();
        BeanContext b3 = BeanContext.Instance;
        b3.print();
        BeanContext b4 = BeanContext.Instance;
        b4.print();
    }


    /**打印结果：
     *
     * 构造函数初始化 init
     * ffffffffffff
     * ffffffffffff
     * ffffffffffff
     * ffffffffffff
     *
     */

}
