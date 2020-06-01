package com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来解决有时候不同策略对应相同逻辑的情况
 *
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:22
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface StrategyIdentifiers {

    StrategyIdentifier[] value();
}
