package com.Sorting.Pactice;
import java.util.*;
public class BubbleSortPractice {
    public static void main(String[] args) {
        int arr[] = {5,3,1,2,4};
        Bubble(arr);
        show(arr);
    }

    public static void Bubble(int arr[]) {
        for(int turn=0; turn<arr.length-1; turn++){
            for(int index=0; index <arr.length-1-turn; index++){
                if(arr[index]< arr[index+1]){
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }
            }
        }
    }
    public static void show(int arr[]){
        System.out.println("Bubble sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
