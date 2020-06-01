package com.tian.designpattern.strategyPattern.demo1.test1.calculatePriceStrategy;

/**
 * 计算价格策略
 *
 * @author David Tian
 * @desc
 * @since 2020-01-05 02:26
 */
public interface CalculatePriceStrategy {

    /**
     * 根据sku以及购买数量计算价格
     * @param sku
     * @param num
     * @return
     */
    Integer calculate(String sku, Integer unitPrice, Integer num);

}
