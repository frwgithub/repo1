package com.array;

public class ArrayDemo1 {
     //创建数组，数组初始化 ，并向其中赋一些默认值
     public static void main(String[] args) {
         /*
          * 1.动态初始化：指定长度 数据类型 [] 数组名称 = new 数据类型[数组长度]
          * 2.静态初始化： 指定内容
          *
          * */
        /* double[] arr = new double[10];
         for (double i : arr) {
             System.out.println(i);
         }
         String[] str = new String[10];
         for (String s : str) {
             System.out.println(s);
         }
         float[] f = new float[10];
         for (float d : f) {
             System.out.println(d);
         }
         boolean [] bo =new boolean[10];
         for (boolean b:bo) {
             System.out.println(b);
         }*/
         char [] c = new char[10];
         for (char ch: c) {
             System.out.println(ch);
         }

     }
}
