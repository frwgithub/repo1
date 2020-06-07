package com.it;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
      File f= new  File("C:\\Users\\fu\\Desktop");
        String absolutePath = f.getAbsolutePath();
        System.out.println(absolutePath);
        File f1 = new File("a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);
        String path = f1.getPath();
        System.out.println(path);
        String path1 = f.getPath();
        System.out.println(
                path1
        );
        System.out.println(f);
        System.out.println(f1);
        f.toString();
        String name = f.getName();
        System.out.println(name);
        long length = f.length();
        System.out.println(length);
        String parent = f.getParent();
        System.out.println(parent);
        long totalSpace = f.getTotalSpace();
        System.out.println(totalSpace);
        long usableSpace = f.getUsableSpace();
        System.out.println(usableSpace);
        boolean file = f.isFile();
        System.out.println(file);
        boolean hidden = f.isHidden();
        System.out.println(hidden);
        String[] list = f.list();
        for (String string:list) {
            System.out.println(string);
        }

    }
}
