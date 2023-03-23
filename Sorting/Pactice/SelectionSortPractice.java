package com.Sorting.Pactice;
import java.util.*;
public class SelectionSortPractice {
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,1};
        selection(arr);
        show(arr);
    }

    public static void selection(int arr[]) {
        for(int index=0; index < arr.length; index++){
            int previous = index;
            for(int secondIndex=index+1; secondIndex<arr.length; secondIndex++){
                if(arr[previous]<arr[secondIndex]){
                    previous = secondIndex;
                }
            }
//          swap;
            int temp = arr[previous];
            arr[previous] = arr[index];
            arr[index] = temp;
        }
    }

    public static void show(int arr[]) {
        System.out.println("Reverse Selection Sort ");
        for(int index=0; index < arr.length; index++){
            System.out.print(arr[index]+" ");
        }

    }
}
