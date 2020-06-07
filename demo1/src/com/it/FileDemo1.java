package com.it;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//路径分隔符 zaiwindows中的分隔符是；
        //在linux中的分隔符是：
        System.out.println(pathSeparator);
        String separator = File.separator;
        System.out.println(separator);//文件名的分隔符 windows /  linux 是正斜杠
//        File tempFile = File.createTempFile("")/
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar);
        char separatorChar = File.separatorChar;
        System.out.println(separatorChar);
        /*
        * 绝对路径 以盘符开始的路径
        * C:\\sdfsdf\\sdf
        * 相对路径
        * 相对于当前项目的根目录
        * C:\\sdfsdf\\sdf\\123.txt
        * 123.txt;相对路径
        * C:\\sdfsdf\\sdf把他作为更目录  可以省略
        * 路径不区分大小写
        * 路径中文件名称的分隔符使用的是反斜杠 \   \\//\\||//\\两个反斜杠代表一个反斜杠
        *
        * */
    }
}
