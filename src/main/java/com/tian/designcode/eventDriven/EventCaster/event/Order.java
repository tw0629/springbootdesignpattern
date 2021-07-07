package com.tian.designcode.eventDriven.EventCaster.event;

/**
 * @author David Tian
 * @desc
 * @since 2021/6/26 11:42
 */
public class Order {

    private String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
