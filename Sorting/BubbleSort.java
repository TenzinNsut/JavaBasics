package com.Sorting;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Sort(arr);
        Show(arr);
    }
    public static void Sort(int arr[]){
        for(int check=0; check < arr.length-1; check++){
            for(int index=0; index < arr.length-1-check; index++){
                if(arr[index] > arr[index+1]){
                    int temp = arr[index];
                    arr[index] = arr[index + 1];
                    arr[index + 1] = temp;
                }
            }
        }
    }

    public static void Show(int arr[]){
        for(int index=0; index < arr.length; index++){
            System.out.print(arr[index]+ " ");
        }
    }
}

