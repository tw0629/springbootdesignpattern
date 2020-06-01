package com.tian.designpattern.responsibilityChainPattern.demo1;

/**
 * @author David Tian
 * @desc 总经理处理类
 * @since 2020-03-18 19:24
 */
public class GManagerLeaveHandler extends AbstractLeaveHandler {

    public GManagerLeaveHandler(String name) {
        this.handlerName = name;
    }

    @Override
    protected void handlerRequest(LeaveRequest request) {
        if(request.getLeaveDays() > this.MIDDLE && request.getLeaveDays() <= this.MAX){
            System.out.println("总经理:" + handlerName + ",已经处理;流程结束。");
            return;
        }

        if(null != this.nextHandler){
            this.nextHandler.handlerRequest(request);
        }else{
            System.out.println("审批拒绝！");
        }
    }
}
