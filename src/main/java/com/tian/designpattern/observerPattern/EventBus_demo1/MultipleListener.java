package com.tian.designpattern.observerPattern.EventBus_demo1;

import com.google.common.eventbus.Subscribe;

/**
 * @author David Tian
 * @desc 消息接受类
 * @since 2019-07-31 15:18
 */
public class MultipleListener {

    public Integer lastInteger;

    public Long lastLong;

    @Subscribe
    public void listenInteger(Integer event) {

        lastInteger = event;

        System.out.println("event Integer:"+lastInteger);

    }

    @Subscribe
    public void listenLong(Long event) {

        lastLong = event;

        System.out.println("event Long:"+lastLong);

    }

    public Integer getLastInteger() {

        return lastInteger;

    }

    public Long getLastLong() {

        return lastLong;

    }

}