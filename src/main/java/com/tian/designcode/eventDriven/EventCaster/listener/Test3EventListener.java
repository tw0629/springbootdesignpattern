package com.tian.designcode.eventDriven.EventCaster.listener;

import com.alibaba.fastjson.JSONObject;
import com.tian.designcode.eventDriven.EventCaster.event.Event;
import com.tian.designcode.eventDriven.EventCaster.event.EventObject;

/**
 * @author David Tian
 * @desc
 * @since 2021/6/26 11:05
 */
public class Test3EventListener extends AbstractEventListener {
    public Test3EventListener(int order) {
        super(order);
    }

    @Override
    public void onEvent(Event event) {
        System.out.println("事件监听器3执行");
        EventObject eventObject = event.getEventObject();
        System.out.println(" Test3EventListener onEvent: " + JSONObject.toJSONString(eventObject));
    }
}
