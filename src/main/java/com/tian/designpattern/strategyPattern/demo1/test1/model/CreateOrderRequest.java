package com.tian.designpattern.strategyPattern.demo1.test1.model;

import com.tian.designpattern.strategyPattern.demo1.test1.enums.UserLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 01:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateOrderRequest {

    private String sku;

    private Integer num;

    private Long userId;

    private UserLevel userLevel;
}
