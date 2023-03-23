package com.Sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,2,3,1,4};
        Selection(arr);
        show(arr);
    }
    public static void Selection(int arr[]){
//        smallest element to front
        for(int index=0; index<arr.length-1; index++){
            int minPos = index;
            for(int secondIndex=index+1; secondIndex < arr.length; secondIndex++){
                if(arr[minPos]>arr[secondIndex]){
                    minPos = secondIndex;
                }
            }
//          **swap**
            int temp = arr[minPos];
            arr[minPos] = arr[index];
            arr[index] = temp;
        }
    }

    public static void show(int arr[]){
        System.out.println("selection sort");
        for(int index=0; index < arr.length; index++){
            System.out.print( arr[index]+" ");
        }
    }
}
