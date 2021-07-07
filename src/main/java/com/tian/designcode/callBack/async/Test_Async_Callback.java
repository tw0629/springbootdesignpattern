package com.tian.designcode.callBack.async;


/**
 * @author David Tian
 * @desc
 * @since 2021-01-02 17:27
 */
public class Test_Async_Callback {

    public static void main(String[] args) {
        Store lawson = new Store("沙中路罗森便利店");
        AsyncBuyer asyncBuyer = new AsyncBuyer(lawson, "cherry", "变形金刚");
        System.out.println(asyncBuyer.orderGoods());
    }
}
