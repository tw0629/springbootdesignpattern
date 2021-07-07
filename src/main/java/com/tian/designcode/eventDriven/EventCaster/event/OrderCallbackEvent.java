package com.tian.designcode.eventDriven.EventCaster.event;


/**
 * @author David Tian
 * @desc
 * @since 2021/6/26 11:23
 */
public class OrderCallbackEvent extends AbstractEvent {
    public OrderCallbackEvent(EventObject eventObject) {
        super(eventObject);
    }
}
