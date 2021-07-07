package com.tian.designpattern.componentPattern.demo2;

/**
 * @author David Tian
 * @desc https://blog.csdn.net/lyabc123456/article/details/80415830
 * @since 2021-01-02 18:21
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 我们先建立一个这样的文件系统
         *               总文件
         *
         *   a.txt       b.jpg               c文件夹
         *                         c_1.text  c_1.rmvb    c_1.jpg
         *
         */

        //----------初始化文件夹-------------

        /**
         * 总文件夹
         */
        Folder zwjj = new Folder("总文件夹");
        //向总文件夹中放入三个文件：1.txt、2.jpg、1文件夹
        TextFile aText= new TextFile("a.txt");
        ImagerFile bImager = new ImagerFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");

        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);



        //向C文件夹中添加文件：c_1.txt、c_1.rmvb、c_1.jpg
        TextFile cText = new TextFile("c_1.txt");
        ImagerFile cImage = new ImagerFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");

        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);



        //----------遍历文件夹下-------------

        //遍历总文件夹
        zwjj.display();

        //遍历C文件夹
        cFolder.display();
        //将c_1.txt删除
        cFolder.remove(cText);
        System.out.println("-----------------------");
        cFolder.display();

    }
}
