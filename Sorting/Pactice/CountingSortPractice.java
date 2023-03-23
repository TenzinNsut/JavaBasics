package com.Sorting.Pactice;
import java.util.*;
public class CountingSortPractice {
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,3,3,5,7};
        Counting(arr);
        show(arr);
    }
    public static void Counting(int arr[]){
//        1. Pick the largest element
        int largest = Integer.MIN_VALUE;
        for(int index=0; index < arr.length; index++){
            largest =  Math.max(largest, arr[index]);
        }

//        2. Count the frequency of elements in Count array;
        int count[] = new int[largest+1];
        for(int index=0;index<arr.length; index++){
            count[arr[index]]++;
        }

//        3. Sorting
        int OriginalIndex = 0;
        for(int index=0; index<count.length; index++){
            while (count[index]>0){
                arr[OriginalIndex] = index;
                OriginalIndex++;
                count[index]--;
            }
        }
    }
    public static void show(int arr[]){
        System.out.println("C O U N T I N G - S O R T");
        for (int index=0; index<arr.length; index++){
            System.out.print(arr[index] + " ");
        }
    }
}
