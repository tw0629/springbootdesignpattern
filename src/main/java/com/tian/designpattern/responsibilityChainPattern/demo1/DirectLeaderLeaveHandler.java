package com.tian.designpattern.responsibilityChainPattern.demo1;

/**
 * @author David Tian
 * @desc 直接主管处理类
 * @since 2020-03-18 19:22
 */
public class DirectLeaderLeaveHandler extends AbstractLeaveHandler{

    public DirectLeaderLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays() <= this.MIN){
            System.out.println("直接主管:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }

    }
}