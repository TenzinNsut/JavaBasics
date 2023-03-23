package com.Sorting;
import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {1,1,3,5,4,3,6,7,6};
        Counting(arr);
        show(arr);
    }

    public static void Counting(int arr[]){
//     1.) Pick the largest element in the array;
        int Largest = Integer.MIN_VALUE;
        for(int index=0; index < arr.length; index++){
            Largest = Math.max(Largest,arr[index]);
        }

//      2.) Count the frequency
        int count[] = new int[Largest+1];
        for(int index=0; index < arr.length; index++){
//          store Original elements in the Count array
            count[arr[index]]++;
        }

//      3.) Sorting (use "count.length")
        int originalIndex = 0;
        for(int index=0; index < count.length; index++){
            while (count[index]>0){
                arr[originalIndex] = index;
                originalIndex++;
                count[index]--;
            }
        }
    }

    public static void show(int arr[]){
        System.out.println("Counting Sort");
        for(int index=0; index < arr.length; index++){
            System.out.print(arr[index]+" ");
        }
    }
}
