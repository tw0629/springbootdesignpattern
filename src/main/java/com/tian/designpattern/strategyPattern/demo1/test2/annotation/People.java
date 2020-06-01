package com.tian.designpattern.strategyPattern.demo1.test2.annotation;

import com.tian.designpattern.strategyPattern.demo1.test2.enums.GenderEnum;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:50
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface People {

    String district();

    GenderEnum gender();

}