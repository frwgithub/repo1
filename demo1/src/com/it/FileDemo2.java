package com.it;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\fu\\Desktop");
        System.out.println(file);
        File f2  = new File("1.txt");
        System.out.println(f2);
        File f3 = new File("C:","123.txt");
        System.out.println(f3);
    }
}
