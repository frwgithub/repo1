package com.array;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //数组反转
        int [] arr  = new int []{1,2,3,4,5};
        int left = 0;
        int right =  arr.length-1;
        int temp;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right --;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
