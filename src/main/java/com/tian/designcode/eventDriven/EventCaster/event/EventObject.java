package com.tian.designcode.eventDriven.EventCaster.event;

/**
 * @author David Tian
 * @desc
 * @since 2021/6/26 11:18
 */
public class EventObject {

    private Order order;

    public EventObject(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
