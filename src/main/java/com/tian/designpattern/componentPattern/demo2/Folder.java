package com.tian.designpattern.componentPattern.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author David Tian
 * @desc
 * @since 2021-01-02 18:19
 */
public class Folder extends File{

    private List<File> files;

    public Folder(String name){
        super(name);
        files = new ArrayList<File>();
    }

    /**
     * 浏览文件夹中的文件
     */
    @Override
    public void display() {
        for(File file : files){
            file.display();
        }
    }

    /**
     * @desc 向文件夹中添加文件
     * @param file
     * @return void
     */
    public void add(File file){
        files.add(file);
    }

    /**
     * @desc 从文件夹中删除文件
     * @param file
     * @return void
     */
    public void remove(File file){
        files.remove(file);
    }

}
