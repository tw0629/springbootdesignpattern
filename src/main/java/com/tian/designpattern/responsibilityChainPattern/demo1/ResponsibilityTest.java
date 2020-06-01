package com.tian.designpattern.responsibilityChainPattern.demo1;

/**
 * @author David Tian
 * @since 2020-03-18 19:24
 * @desc https://www.jianshu.com/p/9f7d9775bdda
 *
 *
 *
 *
 */
public class ResponsibilityTest {

    public static void main(String[] args) {

        //初始化休假人员信息
        LeaveRequest request = LeaveRequest.builder().leaveDays(20).name("小明").build();
        //初始化休假人员的领导
        AbstractLeaveHandler directLeaderLeaveHandler = new DirectLeaderLeaveHandler("县令");
        DeptManagerLeaveHandler deptManagerLeaveHandler = new DeptManagerLeaveHandler("知府");
        GManagerLeaveHandler gManagerLeaveHandler = new GManagerLeaveHandler("京兆尹");
        //设置下一阶段处理者
        directLeaderLeaveHandler.setNextHandler(deptManagerLeaveHandler);
        deptManagerLeaveHandler.setNextHandler(gManagerLeaveHandler);

        //申请休假
        directLeaderLeaveHandler.handlerRequest(request);


    }
}
