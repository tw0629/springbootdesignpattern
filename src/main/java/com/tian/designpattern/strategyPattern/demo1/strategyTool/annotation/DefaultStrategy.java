package com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 默认策略实现
 * 匹配不到策略时，默认走该注解的策略
 * 统一接口策略下,该注解只能有一个
 *
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:09
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface DefaultStrategy {
}