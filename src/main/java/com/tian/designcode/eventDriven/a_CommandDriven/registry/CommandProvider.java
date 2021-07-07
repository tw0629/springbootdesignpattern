package com.tian.designcode.eventDriven.a_CommandDriven.registry;

import com.tian.designcode.eventDriven.a_CommandDriven.handler.CommandHandler;
import org.springframework.context.ApplicationContext;

/**
 * @author David Tian
 * @desc  引入了spring ApplicationContext
 * @since 2021-05-27 21:38
 */
public class CommandProvider<H extends CommandHandler<?,?>> {

    private final ApplicationContext applicationContext;

    private final Class<H> type;

    public CommandProvider(ApplicationContext applicationContext, Class<H> type) {
        this.applicationContext = applicationContext;
        this.type = type;
    }

    public H get() {
        return applicationContext.getBean(type);
    }

}
