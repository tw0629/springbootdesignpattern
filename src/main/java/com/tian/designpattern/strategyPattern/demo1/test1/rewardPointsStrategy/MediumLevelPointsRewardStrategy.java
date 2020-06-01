package com.tian.designpattern.strategyPattern.demo1.test1.rewardPointsStrategy;

import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.StrategyIdentifier;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:28
 */
@StrategyIdentifier(identifyCode = "MEDIUM")
public class MediumLevelPointsRewardStrategy implements PointsRewardStrategy{

    @Override
    public Integer rewardPoints(Integer price) {
        System.out.println("返百分之10积分");
        return price /10000 * 10;
    }
}
