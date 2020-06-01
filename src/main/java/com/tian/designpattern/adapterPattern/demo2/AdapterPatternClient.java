package com.tian.designpattern.adapterPattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2020-03-27 11:38
 */
public class AdapterPatternClient {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
