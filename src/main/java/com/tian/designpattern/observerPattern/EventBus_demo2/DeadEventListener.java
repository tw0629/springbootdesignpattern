package com.tian.designpattern.observerPattern.EventBus_demo2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;
import com.tian.designpattern.observerPattern.EventBus_demo0.TestEvent;


/**
 * @author David Tian
 * @desc
 * @since 2019-07-31 17:01
 */
public class DeadEventListener {

    boolean notDelivered = false;

    @Subscribe
    public void listen(DeadEvent event) {

        notDelivered = true;

        System.out.println("===DeadEvent===>"+event);

    }

    // 优先匹配的listen(TestEvent event), 若没有匹配的监听器就走listen(DeadEvent event)
    /*@Subscribe
    public void listen(TestEvent event) {

        notDelivered = true;

        System.out.println("===TestEvent===>"+event);

    }*/

    public boolean isNotDelivered() {
        return notDelivered;
    }
}