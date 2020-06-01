package com.tian.designpattern.observerPattern.EventBus_demo0;

/**
 * @author David Tian
 * @desc 消息封装类
 * @since 2019-07-31 15:10
 */
public class TestEvent {

    private final int message;

    public TestEvent(int message) {

        this.message = message;

        System.out.println("event message:"+message);

    }

    public int getMessage() {

        return message;

    }

}