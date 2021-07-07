package com.tian.designcode.callBack.async;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-02 17:26
 */
/*异步*/
@Slf4j
public class AsyncBuyer implements OrderResult {
    @Getter
    @Setter
    private Store store;//商店
    @Getter
    @Setter
    private String buyerName;//购物者名
    @Getter
    @Setter
    private String goodsName;//所购商品名

    AsyncBuyer(Store store, String buyerName, String goodsName) {
        this.store = store;
        this.buyerName = buyerName;
        this.goodsName = goodsName;
    }

    /**
     * 调用从商店返回订购物品的信息
     */
    public String orderGoods() {

        // 异步调用store接口
        String goodsState = "***";
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
        System.out.println("---1---"+goodsState);
        goodsState = mr.getResult();// 得到返回值


        myFeeling();// 用来测试异步是不是还是按顺序的执行

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


    /**
     * 开启另一个线程, 但是没有返回值, 怎么回事
     * 调试的时候, 等待一会儿, 还是可以取到值, 但不是立即取到, 在print显示的时候, 却是null, 需要注意?
     */
    private class MyRunnable implements Runnable {
        @Getter
        @Setter
        private String result;

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
                result = store.returnOrderGoodsInfo(AsyncBuyer.this);// 匿名函数的时候, 无法return 返回值
            } catch (InterruptedException e) {
                log.error("出大事了, 异步回调有问题了", e);
            }
        }
    }
}
