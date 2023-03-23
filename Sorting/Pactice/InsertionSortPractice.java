package com.Sorting.Pactice;
import java.util.*;
public class InsertionSortPractice {
    public static void main(String[] args) {
        int arr[] = {5,3,2,1,4};
        Insertion(arr);
        show(arr);
    }
    public static void Insertion(int arr[]){
//        1. Find current and previous elements
        for(int index=1; index< arr.length; index++){
            int current =  arr[index];
            int previous = index-1;
//        2. Find correct position
            while (previous>=0 && arr[previous] < current){
                arr[previous+1] = arr[previous];
                previous--;
            }
//        3. Insertion
            arr[previous+1] = current;

        }
    }

    public static void show(int arr[]){
        System.out.println("Reverse INSERTION SORT");
        for(int index=0; index < arr.length; index++){
            System.out.print(arr[index] + " ");
        }
    }
}
