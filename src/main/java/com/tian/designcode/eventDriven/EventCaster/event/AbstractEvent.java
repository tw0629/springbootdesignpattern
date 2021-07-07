package com.tian.designcode.eventDriven.EventCaster.event;

/**
 * @author David Tian
 * @desc 抽象事件
 * @since 2021/6/26 11:15
 */
public class AbstractEvent implements Event {
    private static final long serialVersionUID = 7992923643226055176L;

    private long timestamp;

    private EventObject eventObject;

    public AbstractEvent(EventObject eventObject){
        this.setEventObject(eventObject);
    }

    @Override
    public EventObject getEventObject() {
        return eventObject;
    }

    @Override
    public void setEventObject(EventObject eventObject) {
        this.eventObject=eventObject;
        this.timestamp=System.currentTimeMillis();
    }
    public long getTimestamp(){
        return this.timestamp;
    }
}
