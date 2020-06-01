package com.tian.designpattern.observerPattern.EventBus_demo1;

import com.google.common.eventbus.EventBus;

/**
 * @author David Tian
 * @desc 测试类
 * @since 2019-07-31 15:18
 */
public class TestEventBus2 {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus("test");

        MultipleListener multiListener = new MultipleListener();

        eventBus.register(multiListener);

        eventBus.post(new Integer(100));

        eventBus.post(new Integer(200));

        eventBus.post(new Integer(300));

        eventBus.post(new Long(800));

        eventBus.post(new Long(800990));

        eventBus.post(new Long(800882934));

        System.out.println("LastInteger:"+multiListener.getLastInteger());

        System.out.println("LastLong:"+multiListener.getLastLong());

    }

}