package com.tian.designcode.eventDriven.EventCaster;

import com.tian.designcode.eventDriven.EventCaster.event.EventObject;
import com.tian.designcode.eventDriven.EventCaster.event.Order;
import com.tian.designcode.eventDriven.EventCaster.event.OrderCallbackEvent;
import com.tian.designcode.eventDriven.EventCaster.listener.AbstractEventListener;
import com.tian.designcode.eventDriven.EventCaster.listener.Test1EventListener;
import com.tian.designcode.eventDriven.EventCaster.listener.Test2EventListener;
import com.tian.designcode.eventDriven.EventCaster.listener.Test3EventListener;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author David Tian
 * @desc 测试入口
 *
 * https://blog.csdn.net/wszhm123/article/details/106348037
 *
 * @since 2021/6/26 11:40
 */
public class CasterMain {

    public static void main(String[] args){
        //定义三个监听器
        List<AbstractEventListener> listeners=new ArrayList<>(3);
        listeners.add(new Test1EventListener(2));
        listeners.add(new Test2EventListener(1));
        listeners.add(new Test3EventListener(3));
        //可以根据listeners里的order做排序
        listeners=listeners.stream().sorted(Comparator.comparing(AbstractEventListener::getOrder)).collect(Collectors.toList());


        //定义广播器 (TODO： 核心)
        EventMulticaster eventMulticaster=new EventMulticaster(listeners);

        //定义eventObject
        Order order=new Order("wx"+System.currentTimeMillis());
        EventObject eventObject=new EventObject(order);

        //广播事件
        eventMulticaster.multicastEvent(new OrderCallbackEvent(eventObject));

        System.out.println("======= eventMulticaster end =========");
    }

}
