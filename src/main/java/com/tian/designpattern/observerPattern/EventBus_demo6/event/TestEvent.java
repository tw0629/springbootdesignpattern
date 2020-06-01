package com.tian.designpattern.observerPattern.EventBus_demo6.event;

import lombok.Data;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-02 14:10
 */
@Data
public class TestEvent {

    private String tian;

    private String wei;

    public TestEvent(String tian, String wei) {
        this.tian = tian;
        this.wei = wei;
    }
}
