package com.tian.designcode.eventDriven.EventCaster.event;

import java.io.Serializable;

/**
 * @author David Tian
 * @desc 事件接口
 * @since 2021/6/26 11:10
 */
public interface Event extends Serializable {

    /**
     * 获取事件持有的对象
     */
    EventObject getEventObject();

    /**
     * 设置事件持有的对象
     */
    void setEventObject(EventObject eventObject);
}
