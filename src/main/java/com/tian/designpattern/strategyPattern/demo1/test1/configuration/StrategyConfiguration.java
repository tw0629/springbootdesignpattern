package com.tian.designpattern.strategyPattern.demo1.test1.configuration;

import com.tian.designpattern.strategyPattern.demo1.strategyTool.StrategyContainerFactoryBean;
import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.StrategyIdentifier;
import com.tian.designpattern.strategyPattern.demo1.test1.calculatePriceStrategy.CalculatePriceStrategy;
import com.tian.designpattern.strategyPattern.demo1.test1.rewardPointsStrategy.PointsRewardStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:03
 */
@Configuration
public class StrategyConfiguration {

    @Bean
    public StrategyContainerFactoryBean calculatePriceStrategyManager2(){
        return StrategyContainerFactoryBean.build(CalculatePriceStrategy.class, StrategyIdentifier.class,(a)->a.identifyCode());
    }

    @Bean
    public StrategyContainerFactoryBean<PointsRewardStrategy, StrategyIdentifier> pointsRewardStrategyManager3(){
        StrategyContainerFactoryBean<PointsRewardStrategy, StrategyIdentifier> factoryBean = new StrategyContainerFactoryBean<>();
        factoryBean.setStrategyClass(PointsRewardStrategy.class);
        factoryBean.setStrategyAnnotationClass(StrategyIdentifier.class);
        factoryBean.setIdentifyCodeGetter((a)->a.identifyCode());
        return factoryBean;
    }

}
