package com.tian.designpattern.observerPattern.EventBus_demo6;

import com.google.common.eventbus.EventBus;
import com.tian.designpattern.observerPattern.EventBus_demo6.event.SignInEvent;
import com.tian.designpattern.observerPattern.EventBus_demo6.event.TestEvent;
import com.tian.designpattern.observerPattern.EventBus_demo6.listener.SignInProcessor;
import com.tian.designpattern.observerPattern.EventBus_demo6.listener.TestProcessor;
import org.junit.Test;

/**
 * @author David Tian
 * @desc
 * @since 2019-08-02 13:41
 */
public class AppTest {

    @Test
    public void eventBusTest() {

        //新建EventBus
        EventBus signInEventBus = new EventBus("SignInEventBus");


        //新建Listener
        SignInProcessor processor = new SignInProcessor();
        //注册Listener到EventBus
        signInEventBus.register(processor);

        //注册一个新的测试Listener
        TestProcessor testProcessor = new TestProcessor();
        signInEventBus.register(testProcessor);


        //发布事件
        //!!!只要是Listener中@subscribe方法中入参是SignInEvent的都会触发
        signInEventBus.post(new SignInEvent(2));

        signInEventBus.post(new TestEvent("tian","piaoyi"));


        System.out.println("================");

    }
}