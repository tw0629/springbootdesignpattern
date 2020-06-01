package com.tian.designpattern.observerPattern.EventBus_demo0;

import com.google.common.eventbus.EventBus;

/**
 * @author David Tian
 * @desc
 * @since 2019-07-31 15:11
 */
public class TestEventBus {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();
        eventBus.register(listener);

        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));
        eventBus.post(new TestEvent(400));

        System.out.println("LastMessage:"+listener.getLastMessage());

    }

}