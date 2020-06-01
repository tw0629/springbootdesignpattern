package com.tian.designpattern.strategyPattern.demo1.test2.configuration;

import com.google.common.base.Joiner;
import com.tian.designpattern.strategyPattern.demo1.strategyTool.MultiStrategyContainerFactoryBean;
import com.tian.designpattern.strategyPattern.demo1.strategyTool.StrategyContainerFactoryBean;
import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.StrategyIdentifier;
import com.tian.designpattern.strategyPattern.demo1.test2.annotation.One;
import com.tian.designpattern.strategyPattern.demo1.test2.annotation.People;
import com.tian.designpattern.strategyPattern.demo1.test2.helloStrategy.HelloStrategy;
import com.tian.designpattern.strategyPattern.demo1.test2.repeatableStrategy.RepeatableStrategy;
import com.tian.designpattern.strategyPattern.demo1.test2.validationstrategy.Validation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:48
 */
@Configuration
public class StrategyConfiguration2 {

    @Bean
    public StrategyContainerFactoryBean<HelloStrategy, People> helloStrategyManager(){
        /*StrategyManagerFactoryBean<HelloStrategy, People> factoryBean = new StrategyManagerFactoryBean<>();
        factoryBean.setStrategyClass(HelloStrategy.class);
        factoryBean.setStrategyAnnotationClass(People.class);
        factoryBean.setIdentifyCodeGetter(a -> Joiner.on(",").join(a.district(),a.gender().name()));
        return factoryBean;*/
        return StrategyContainerFactoryBean.build(HelloStrategy.class,People.class, a -> Joiner.on(",").join(a.district(),a.gender().name()));
    }

    @Bean
    public StrategyContainerFactoryBean<RepeatableStrategy, One> repeatableStrategyManager(){
        return StrategyContainerFactoryBean.build(RepeatableStrategy.class,One.class, a -> a.test());
    }

    @Bean
    public MultiStrategyContainerFactoryBean<Validation, StrategyIdentifier> validation(){
        return MultiStrategyContainerFactoryBean.build(Validation.class,StrategyIdentifier.class, a -> a.identifyCode());
    }

}
