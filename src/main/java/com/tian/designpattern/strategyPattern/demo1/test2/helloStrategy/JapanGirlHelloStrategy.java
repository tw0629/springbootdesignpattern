package com.tian.designpattern.strategyPattern.demo1.test2.helloStrategy;

import com.tian.designpattern.strategyPattern.demo1.test2.annotation.People;
import com.tian.designpattern.strategyPattern.demo1.test2.enums.GenderEnum;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:53
 */
@People(district = "japan",gender = GenderEnum.FEMALE)
public class JapanGirlHelloStrategy implements HelloStrategy{
    @Override
    public String hello() {
        return "ohayo";
    }
}
