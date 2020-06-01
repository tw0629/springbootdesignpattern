package com.tian.designpattern.templatePattern.demo1;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-18 23:31
 */
public class Football extends Game {

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}