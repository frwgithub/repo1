package com.array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int [] arr = new int [10];
        System.out.println(arr);
        //char 的默认值为‘\u0000’不可见
        for (int a:arr) {
            System.out.println(a);
        }
        System.out.println(arr.length);//数组在程序运行期间长度不能改变

    }
}
