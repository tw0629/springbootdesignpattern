package com.tian.designpattern.observerPattern.EventBus_demo10;

import com.google.common.eventbus.Subscribe;

/**
 * @author David Tian
 * @since 2019-07-31
 */
public class DataObserver1 {

    /**
     * 只有通过@Subscribe注解的方法才会被注册进EventBus
     * 而且方法有且只能有1个参数
     *
     * @param msg
     */
    @Subscribe
    public void func(String msg) {
        System.out.println("String msg: " + msg);
    }

}