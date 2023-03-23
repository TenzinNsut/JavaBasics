package com.Arrays.Practice;
import java.util.*;
public class Problem2 {
//   source = https://redquark.org/leetcode/0033-search-in-rotated-sorted-array/
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("index = "+findIndex(arr, target));
    }
    public static int findIndex(int arr[], int target){
//      Edge case:
        if(arr == null || arr.length == 0){
            return -1;
        }
//      Start and end pointers
        int start =  0;
        int end = arr.length-1;

//      To find the pivot
        while (start < end){
            int mid = start + (end - start) / 2;
//          if(mid > end) -> rotated after mid + 1
//          [4,5,6,"7","0",1,2]
            if(arr[mid] > arr[end]){
                start = mid + 1;
            } else{
                end = mid;
            }
        }
//      After the loop is completed,
//      start will point to pivot
        int pivot = start;
        start = 0;
        end = arr.length - 1;

//      Find which half has our target value
        if(target >= arr[pivot] && target <= arr[end]){
            start = pivot;
        }else{
            end = pivot;
        }

//      Now perform normal binary search;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if( arr[mid] ==  target){
                return mid;
            }else if( target < arr[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
