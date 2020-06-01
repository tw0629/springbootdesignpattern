package com.tian.designpattern.strategyPattern.demo1.test1;

import com.tian.designpattern.strategyPattern.demo1.test1.enums.UserLevel;
import com.tian.designpattern.strategyPattern.demo1.test1.model.CreateOrderRequest;
import com.tian.designpattern.strategyPattern.demo1.test1.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class StrategyTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testAssembleStrategy(){
        orderService.createOrder(CreateOrderRequest.builder()
                .sku("F1233")
                .num(3)
                .userId(1234L)
                .userLevel(UserLevel.MEDIUM)
                .build());

        orderService.createOrder(CreateOrderRequest.builder()
                .sku("F1233")
                .num(3)
                .userId(1234L)
                .userLevel(UserLevel.HIGH)
                .build());

        orderService.createOrder(CreateOrderRequest.builder()
                .sku("V1233")
                .num(3)
                .userId(1234L)
                .userLevel(UserLevel.HIGH)
                .build());
    }

}