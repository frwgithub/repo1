package com.array;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int [] arr = {1,33,5,7};
        print(arr,"hello");
    }
    public  static void print(int [] arr, String str){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(str);
        int [] a = add();
        for (int i=0;i<3;i++){
            System.out.println(a[i]);
        }
    }
    public static int [] add(){
        return new int[]{1,3,4};
    }


}
