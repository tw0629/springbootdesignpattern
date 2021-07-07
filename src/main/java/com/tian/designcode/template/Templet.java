package com.tian.designcode.template;

/**
 * @author David Tian
 * @desc 一 用继承的方式实现模板
 * @since 2021-01-02 16:03
 */
public abstract class Templet {

    /**
     * 模板方法 (即固定不变的代码)
     */
    public void doTemplet(){

        System.out.println("固定代码1");

        //业务逻辑代码
        doSomething();

        System.out.println("固定代码2");

    }

    // 继承类实现
    public abstract void doSomething();
}
