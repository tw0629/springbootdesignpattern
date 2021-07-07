package com.tian.designcode.callBack.async;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-02 17:25
 */
public class Store {
    @Getter
    @Setter
    private String name;

    Store(String name) {
        this.name = name;
    }

    /**
     * 回调函数, 将结构传给那个我们不能直接调用的方法, 然后获取结果
     */
    public String returnOrderGoodsInfo(OrderResult order) {
        System.out.println("收到订购请求。。。。。。");

        String[] s = {"订购中...", "订购失败", "即将发货!", "运输途中...", "已在投递"};
        Random random = new Random();
        int temp = random.nextInt(5);
        String s1 = s[temp];

        // 回调函数
        return order.getOrderResult(s1);
    }
}
