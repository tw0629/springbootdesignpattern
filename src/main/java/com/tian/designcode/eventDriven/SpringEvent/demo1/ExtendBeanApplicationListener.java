package com.tian.designcode.eventDriven.SpringEvent.demo1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author David Tian
 * @desc
 * @since 2021/6/26 10:19
 */
@Component
public class ExtendBeanApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到事件 ExtendBeanApplicationListener 形式一："+applicationEvent.toString());
    }
}
