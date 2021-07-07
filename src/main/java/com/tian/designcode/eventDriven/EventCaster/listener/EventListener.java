package com.tian.designcode.eventDriven.EventCaster.listener;

import com.tian.designcode.eventDriven.EventCaster.event.Event;

/**
 * @author David Tian
 * @desc 监听器接口类
 * @since 2021/6/26 11:25
 */
public interface EventListener {
    /**
     * 触发事件方法
     * @param event
     */
    void onEvent(Event event);
}
