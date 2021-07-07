package com.tian.designcode.callBack.sync;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

/**
 * @author David Tian
 * @desc 同步, 顾客在商店预订商品, 商店通知顾客预订情况
 * @since 2021-01-02 17:06
 */
public class SyncBuyer implements OrderResult {

    @Getter
    @Setter
    private Store store;//商店

    @Getter
    @Setter
    private String buyerName;//购物者名

    @Getter
    @Setter
    private String goodsName;//所购商品名

    public SyncBuyer(Store store, String buyerName, String goodsName) {

        // 注入Store
        this.store = store;

        this.buyerName = buyerName;
        this.goodsName = goodsName;
    }

    /**
     * 调用从商店返回订购物品的信息
     */
    public String orderGoods() {

        /**
         * 同步调用store接口
         * store.returnOrderGoodsInfo------传递的入参是Store接口的实现类
         */
        String goodsState = store.returnOrderGoodsInfo(this);
        System.out.println(goodsState);


        myFeeling();// 测试同步还是异步, 同步需要等待, 异步无需等待

        return goodsState;

    }

    public void myFeeling() {
        String[] s = {"有点小激动", "很期待!", "希望是个好货!"};
        Random random = new Random();
        int temp = random.nextInt(3);
        System.out.println("我是" + this.getBuyerName() + ", 我现在的感觉: " + s[temp]);
    }


    /**
     * 被回调的方法, 我们自己不去调用, 这个方法给出的结果, 是其他接口或者程序给我们的, 我们自己无法产生
     */
    @Override
    public String getOrderResult(String state) {
        return "在" + this.getStore().getName() + "商店订购的" + this.getGoodsName() + "玩具, 目前的预订状态是: " + state;
    }
}
