package com.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int arr [] = new int []{3,7,1,9,12,45,-2,-90};
        int max =arr[0];
        for (int i = 1;i < arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
