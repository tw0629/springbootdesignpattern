package com.tian.designcode.callBack.sync;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-02 17:07
 */
public class Test_Sync_Callback {

    public static void main(String[] args) {
        Store wallMart = new Store("沙中路沃尔玛");
        SyncBuyer syncBuyer = new SyncBuyer(wallMart, "小明", "超能铁扇公主");
        System.out.println(syncBuyer.orderGoods());
    }
}
