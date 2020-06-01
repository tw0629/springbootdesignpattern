package com.tian.designpattern.observerPattern.EventBus_demo2;

import com.google.common.eventbus.EventBus;
import com.tian.designpattern.observerPattern.EventBus_demo0.TestEvent;
import org.junit.Test;

/**
 * @author David Tian
 * @desc 如果EventBus发送的消息都不是订阅者关心的称之为Dead Event。
 *       https://www.cnblogs.com/peida/p/EventBus.html
 *
 * @since 2019-07-31 17:02
 */
public class TestDeadEventListeners {

    @Test
    public void testDeadEventListeners() throws Exception {

        EventBus eventBus = new EventBus("test");
        DeadEventListener deadEventListener = new DeadEventListener();
        eventBus.register(deadEventListener);

        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));

        System.out.println("deadEvent:"+deadEventListener.isNotDelivered());

    }
}