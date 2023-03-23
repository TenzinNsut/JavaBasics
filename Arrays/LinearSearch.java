package com.Arrays;
import java.util.*;
public class LinearSearch {

    public static void LinearSearch(int arr[], int key){
        for(int index=0; index<arr.length; index++){
            if(arr[index] == key)
                System.out.println("index = " + index);
        }
        System.out.println("Element is not present in the array");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int arr[] = {1, 4, 23, 2, 5, 5, 10, 6, 7, 8};

        LinearSearch(arr,key);
    }
}
