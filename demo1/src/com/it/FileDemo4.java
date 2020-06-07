package com.it;

import java.io.File;
import java.net.SocketTimeoutException;

public class FileDemo4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\fu\\Desktop\\1.txt");//路径存在
        System.out.println(file.exists());
       File f = new File("C:\\123");
        System.out.println(f.exists());
        File src = new File("FileDemo1.java");
//        System.out.println();
        String absolutePath = src.getAbsolutePath();
        System.out.println(absolutePath);
        System.out.println(file.isDirectory());
    }
}
