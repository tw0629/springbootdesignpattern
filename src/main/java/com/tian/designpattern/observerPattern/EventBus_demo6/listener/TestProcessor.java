package com.tian.designpattern.observerPattern.EventBus_demo6.listener;

import com.google.common.eventbus.Subscribe;
import com.tian.designpattern.observerPattern.EventBus_demo6.event.SignInEvent;
import com.tian.designpattern.observerPattern.EventBus_demo6.event.TestEvent;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-02 14:09
 */
public class TestProcessor {

    @Subscribe
    public void w1(SignInEvent event) {
        System.out.println("subscribe w1 method  Param:SignInEvent--"+event+" ------ "+event.getCount());
    }

    @Subscribe
    public void w2(TestEvent event) {
        System.out.println("subscribe w2 method  Param:SignInEvent--"+event+" ------ "+event.toString());
    }
}
