package com.tian.designpattern.observerPattern.EventBus_demo0;

import com.google.common.eventbus.Subscribe;

/**
 * @author David Tian
 * @desc
 * @since 2019-07-31 15:11
 */
public class EventListener {

    public int lastMessage = 0;

    @Subscribe
    public void hanble(TestEvent event) {

        lastMessage = event.getMessage();

        System.out.println("message:"+lastMessage);

    }

    public int getLastMessage() {

        return lastMessage;

    }

}

