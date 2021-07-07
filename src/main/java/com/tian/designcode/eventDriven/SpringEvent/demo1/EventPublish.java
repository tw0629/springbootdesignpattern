package com.tian.designcode.eventDriven.SpringEvent.demo1;

import com.tian.DesignpatternApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author David Tian
 * @desc
 * @since 2021/6/26 10:20
 */
//@Component
public class EventPublish {

    /*@Autowired
    private static ApplicationContext applicationContext;*/

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Appconfig.class);
        applicationContext.refresh();
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
        });
        applicationContext.close();

    }

    /**
     * 将EventPublish 也注上@Component即可生效
     */
    @EventListener
    @Async
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到事件 @EventListener 形式二："+applicationEvent.toString());
    }

}
