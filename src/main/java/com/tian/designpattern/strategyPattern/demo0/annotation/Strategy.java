package com.tian.designpattern.strategyPattern.demo0.annotation;

import java.lang.annotation.*;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 01:07
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Strategy {
    String name() default "";
}
