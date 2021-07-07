package com.tian.designcode.abstractClass_Impl_Interface.demo1;


import com.tian.designcode.abstractClass_Impl_Interface.demo1.model.ItemManager;
import com.tian.designcode.abstractClass_Impl_Interface.demo1.model.Param;
import com.tian.designcode.abstractClass_Impl_Interface.demo1.model.Result;
import com.tian.designcode.abstractClass_Impl_Interface.demo1.model.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author David Tian
 * @desc
 * @since 2020-12-31 19:48
 */
public abstract class BaseActivityManager implements ActivityManager {

    //protected Logger logger = xxxLogger;
    protected Logger logger = LoggerFactory.getLogger(BaseActivityManager.class);

    @Autowired
    protected UserManager userManager;

    @Autowired
    protected ItemManager itemManager;

    public abstract Result subProcess(Param param);

    //定义子类处理流程
    @Override
    public Result process(Param param) {

        try{
            //入参检查
            checkParam(param);
            //用户登录检查
            checkLogin(param);
            //活动权限检查，商家是否能管理该活动
            checkRole(param);
            //操作日志记录
            operationLog(param);
            //其他业务逻辑
            doOtherBiz(param);


            //最后执行操作
            return subProcess(param);


        }catch(Exception e) {
            //记录异常
            //log(e);
            logger.error(e.getMessage());
        }

        return null;
    }



    // protected abstract void checkParam(Param param);
    private void checkParam(Param param){
    }

    private void checkLogin(Param param){
    }

    private void checkRole(Param param){
    }

    private void operationLog(Param param){
    }

    private void doOtherBiz(Param param) {
    }

}
