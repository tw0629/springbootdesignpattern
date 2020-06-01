package com.tian.designpattern.adapterPattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 11:36
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
