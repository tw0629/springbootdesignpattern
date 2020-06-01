package com.tian.designpattern.strategyPattern.demo1.test2.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:46
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Many.class)
@Component
public @interface One {

    String test();

}
