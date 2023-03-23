package com.Arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,5,6,7,8,9,10};
        int key = 9;
        System.out.println("Element is at index: " + binarySearch(arr, key));
    }
    public static int binarySearch(int arr[], int key){
        int start_index = 0;
        int last_index = arr.length;

        while (start_index<last_index){
            int mid =  (start_index+last_index)/2;

            if(arr[mid] == key) return mid;
            if(arr[mid] < key) start_index = mid+1;
            else last_index = mid-1;
        }
//      edge case: (element does not exist)
        return -1;

    }
}
