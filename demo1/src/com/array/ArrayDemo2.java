package com.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //静态创建数组
        int arr [] = new int [] {1,2,3,4,5,6};
        for (int i:arr) {
            System.out.println(i);
        }
        //System.out.println(arr.);
        String [] str = new String[] {"付仁威","王鹏","张新磊"};
        for (String s:str) {
            System.out.println(s);
        }
        //静态初始化 可以有省略
        int [] arr1 ={3,4,56,78};
        for (int e:arr1) {
            System.out.println(e);
        }
        int[] arr2 ;
        arr2 = new int []{1,3,4};
        int [] arr3 ;
//        arr3 = {1,234,5};
    }
}
