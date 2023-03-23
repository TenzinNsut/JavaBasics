package com.PepCode;
import  java.util.*;
public class LearningArray {
    public static void fun(int[] arr) {
        arr[2] = 2;
        arr[4] = 4;

//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
        for(int val: arr){
            System.out.print(val + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr =  new int[5];
        arr[0] = 1;
        arr[1] = 8;
        arr[3] = 3;
        fun(arr);
    }
}
