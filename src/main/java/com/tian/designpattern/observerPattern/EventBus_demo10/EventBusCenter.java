package com.tian.designpattern.observerPattern.EventBus_demo10;

import com.google.common.eventbus.EventBus;

/**
 * @author David Tian
 * @since 2019-07-31
 */
public class EventBusCenter {

    private static EventBus eventBus = new EventBus();

    private EventBusCenter() {

    }

    public static EventBus getInstance() {
        return eventBus;
    }

    public static void register(Object obj) {
        eventBus.register(obj);
    }

    public static void unregister(Object obj) {
        eventBus.unregister(obj);
    }

    public static void post(Object obj) {
        eventBus.post(obj);
    }

}
