package com.Arrays.Practice;
import java.util.*;
public class RepeatedElements {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,1};
        int arr[] = {1, 2, 3, 4};
        System.out.println(Repeated(arr));
    }
    public static boolean Repeated(int arr[]) {
        for(int index=1; index < arr.length; index++){
            if(arr[index] == arr[index-1]){
                return true;
            }
        }
        return false;
    }
}

//        for(int index=0; index<arr.length; index++){
//            for(int check=1; check< arr.length; check++){
//                if(arr[index] == arr[check]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
