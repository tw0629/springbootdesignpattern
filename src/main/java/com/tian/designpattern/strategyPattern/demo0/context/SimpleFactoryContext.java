package com.tian.designpattern.strategyPattern.demo0.context;

import com.tian.designpattern.strategyPattern.demo0.stategy.Strategy;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.apache.commons.lang.exception.NestableException;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 01:18
 */
public class SimpleFactoryContext {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleFactoryContext.class);
    private static Map<String, Class> allStrategies;

    static {
        Reflections reflections = new Reflections("com.tian.designpattern.strategyPattern.demo0.strategy");
        Set<Class<?>> annotatedClasses =
                reflections.getTypesAnnotatedWith(com.tian.designpattern.strategyPattern.demo0.annotation.Strategy.class);
        allStrategies = new ConcurrentHashMap<String, Class>();
        for (Class<?> classObject : annotatedClasses) {
            com.tian.designpattern.strategyPattern.demo0.annotation.Strategy strategy = (com.tian.designpattern.strategyPattern.demo0.annotation.Strategy) classObject
                    .getAnnotation(com.tian.designpattern.strategyPattern.demo0.annotation.Strategy.class);
            allStrategies.put(strategy.name(), classObject);
        }
        allStrategies = Collections.unmodifiableMap(allStrategies);
    }

    private Strategy strategy;

    public SimpleFactoryContext(){
        String name = null;
        try {
            XMLConfiguration config = new XMLConfiguration("strategy.xml");
            name = config.getString("strategy.name");
            LOG.info("strategy name is {}", name);
        } catch (NestableException ex) {
            LOG.error("Parsing xml configuration file failed", ex);
        }

        if (allStrategies.containsKey(name)) {
            LOG.info("Created strategy name is {}", name);
            try {
                strategy = (Strategy) allStrategies.get(name).newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                LOG.error("Instantiate Strategy failed", ex);
            }
        } else {
            LOG.error("Specified Strategy name {} does not exist", name);
        }

    }

    public void action(String input) {
        strategy.strategy(input);
    }

}
