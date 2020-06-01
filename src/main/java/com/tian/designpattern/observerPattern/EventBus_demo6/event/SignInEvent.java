package com.tian.designpattern.observerPattern.EventBus_demo6.event;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-02 13:40
 */
public class SignInEvent {
    // 签到天数
    private int count;

    public SignInEvent(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}