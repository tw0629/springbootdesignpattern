package com.tian.designcode.eventDriven.EventCaster.listener;


import com.tian.designcode.eventDriven.EventCaster.event.Event;

/**
 * @author David Tian
 * @desc 监听器抽象实现
 * @since 2021/6/26 11:05
 */
public abstract class AbstractEventListener implements EventListener {

    /**
     * 监听器顺序
     */
    private int order;

    public int getOrder(){
        return order;
    }

    public AbstractEventListener(int order){
        this.order=order;
    }

    @Override
    public void onEvent(Event event) {

    }
}
