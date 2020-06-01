package com.tian.designpattern.adapterPattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 11:36
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
