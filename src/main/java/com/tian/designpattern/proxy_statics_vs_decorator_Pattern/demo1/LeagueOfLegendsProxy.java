package com.tian.designpattern.proxy_statics_vs_decorator_Pattern.demo1;

import java.util.Random;

/**
 * @author David Tian
 * @desc    静态代理
 * @since 2020-03-19 01:47
 */
public class LeagueOfLegendsProxy implements Game{

    private Game mGame;
    private String mUserName;
    private String mUserPwd;
    private boolean isLogin;

    LeagueOfLegendsProxy(Game game, String userName, String userPwd) {
        mGame = game;
        mUserName = userName;
        mUserPwd = userPwd;
    }

    @Override
    public void play() {
        if (login(mUserName, mUserPwd)) {
            System.out.println(getClass().getSimpleName() + "登陆成功");
            mGame.play();
            System.out.println(getClass().getSimpleName() + "游戏胜利");
            if (playAgain()) {
                play();
            } else {
                isLogin = false;
                System.out.println(getClass().getSimpleName() + "退出登陆");
            }
        } else {
            System.out.println(getClass().getSimpleName() + "登陆失败");
        }
    }

    private boolean login(String userName, String userPwd) {
        if (isLogin) {
            return true;
        } else {
            System.out.println(getClass().getSimpleName() + "正在登陆对方账户:" + mUserName);
            isLogin = new Random().nextInt(10) % 2 == 0;
        }
        return isLogin;
    }

    private boolean playAgain() {
        return new Random().nextInt(10) % 2 == 0;
    }

}
