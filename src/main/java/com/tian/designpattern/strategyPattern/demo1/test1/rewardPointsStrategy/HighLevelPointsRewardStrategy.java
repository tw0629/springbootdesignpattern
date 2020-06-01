package com.tian.designpattern.strategyPattern.demo1.test1.rewardPointsStrategy;

import com.tian.designpattern.strategyPattern.demo1.strategyTool.annotation.StrategyIdentifier;

/**
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:29
 */
@StrategyIdentifier(identifyCode = "HIGH")
public class HighLevelPointsRewardStrategy implements PointsRewardStrategy{

    @Override
    public Integer rewardPoints(Integer price) {
        System.out.println("返百分之15积分");
        return price /10000 * 15;
    }
}