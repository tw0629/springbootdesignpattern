package com.tian.designpattern.observerPattern.EventBus_demo6.listener;

import com.google.common.eventbus.Subscribe;
import com.tian.designpattern.observerPattern.EventBus_demo6.event.SignInEvent;
import com.tian.designpattern.observerPattern.EventBus_demo6.event.TestEvent;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-02 13:41
 */
public class SignInProcessor {

    @Subscribe
    public void signIn(SignInEvent event) {
        int count = event.getCount();
        // TODO 根据签到的天数发放奖励
        System.out.println("签到" + count + "天");
    }

    @Subscribe
    public void t1(SignInEvent event){

        System.out.println("subscribe t11111 method  Param:SignInEvent--"+event+" ------ "+event.getCount());

    }

    @Subscribe
    public void t2(TestEvent event) {
        System.out.println("subscribe t22222 method  Param:SignInEvent--"+event+" ------ "+event.toString());
    }
}