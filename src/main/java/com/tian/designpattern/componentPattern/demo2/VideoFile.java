package com.tian.designpattern.componentPattern.demo2;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-02 18:20
 */
public class VideoFile extends File{

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是影像文件，文件名：" + super.getName());
    }

}
