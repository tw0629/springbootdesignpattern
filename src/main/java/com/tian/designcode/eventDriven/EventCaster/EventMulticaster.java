package com.tian.designcode.eventDriven.EventCaster;


import com.tian.designcode.eventDriven.EventCaster.event.Event;
import com.tian.designcode.eventDriven.EventCaster.listener.AbstractEventListener;

import java.util.List;

/**
 * @author David Tian
 * @desc 事件广播器
 * @since 2021/6/26 11:04
 */
public class EventMulticaster {

    private List<AbstractEventListener> listeners;

    public EventMulticaster(List<AbstractEventListener> listeners){
        this.listeners=listeners;
    }

    /**
     * 广播事件
     * @param event
     */
    public void multicastEvent(Event event){
        for(AbstractEventListener listener : listeners){
            listener.onEvent(event);
        }
    }

}
