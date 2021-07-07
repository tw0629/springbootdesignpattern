package com.tian.designcode.eventDriven.SpringEvent.demo2;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author David Tian
 * @desc
 * @since 2021/6/26 14:18
 */
public class MyActionListener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到事件:" + applicationEvent);
    }
}
