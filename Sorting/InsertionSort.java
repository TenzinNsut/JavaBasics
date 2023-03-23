package com.Sorting;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,2,3,1,4};
        Insertion(arr);
        show(arr);
    }
    public static void Insertion(int arr[]){
        for(int index=1; index<arr.length;index++){
            int current = arr[index];
            int previous = index-1;
//          To find position
            while(previous>=0 && arr[previous]>current){
                arr[previous+1] = arr[previous];
                previous--;
            }
//          For Insertion
            arr[previous+1] = current;
        }
    }

    public static void show(int arr[]){
        System.out.println("Insertion Sort");
        for(int index=0; index<arr.length ; index++){
            System.out.print(arr[index] +" ");
        }
    }
}
