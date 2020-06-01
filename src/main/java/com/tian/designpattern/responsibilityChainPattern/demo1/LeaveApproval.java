package com.tian.designpattern.responsibilityChainPattern.demo1;

/**
 * @author David Tian
 * @desc  不使用 责任链式模式的写法
 * https://www.jianshu.com/p/068a5f3fe14f
 * @since 2020-03-18 20:43
 *
 * 缺乏灵活性，流程确定后不可再修改
 *
 */
public class LeaveApproval {

    public boolean process(String request, int number) {

        // 主管处理
        boolean result = handleByDirector(request);

        // 主管不批准
        if (result == false) {
            return false;

        // 主管批准且天数小于 3
        } else if (number < 3) {
            return true;
        }

        // 准管批准且天数大于等于 3，提交给经理处理
        result = handleByManager(request);
        // 经理不批准
        if (result == false) {
            return false;

        // 经理批准且天数小于 7
        } else if (number < 7) {
            return true;
        }

        // 经理批准且天数大于等于 7，提交给总经理处理
        result = handleByTopManager(request);
        // 总经理不批准
        if (result == false) {
            return false;
        }

        // 总经理最后批准
        return true;
    }

    public boolean handleByDirector(String request) {
        // 主管处理该请假申请
        return true;
    }

    public boolean handleByManager(String request) {
        // 经理处理该请假申请
        return true;
    }

    public boolean handleByTopManager(String request) {
        // 总经理处理该请假申请
        return true;
    }
}