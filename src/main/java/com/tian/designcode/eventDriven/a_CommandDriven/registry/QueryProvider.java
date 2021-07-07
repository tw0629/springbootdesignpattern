package com.tian.designcode.eventDriven.a_CommandDriven.registry;

import com.tian.designcode.eventDriven.a_CommandDriven.handler.QueryHandler;
import org.springframework.context.ApplicationContext;

/**
 * @author David Tian
 * @desc
 * @since 2021-05-27 21:44
 */
public class QueryProvider<H extends QueryHandler<?,?>> {

    private final ApplicationContext applicationContext;

    private final Class<H> type;

    public QueryProvider(ApplicationContext applicationContext, Class<H> type) {
        this.applicationContext = applicationContext;
        this.type = type;
    }

    public H get() {
        return applicationContext.getBean(type);
    }
}
