package com.Arrays;
import java.util.*;
public class PrefixSum {
//  Video had some error:
//  for(int end=start; ....
//  current sum = end == 0 ? prefix[end]
//  Max_Sum = 8;

// Correct value:
// for(int end=start+1; ....
// current sum = end == 0? prefix[end]
// Max_Sum =  7;
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        MaxPrefixSum(arr);
    }
    public static void MaxPrefixSum(int arr[]){
        int current_sum=0;
        int max_sum =  Integer.MIN_VALUE;
//      create an empty Prefix array of size = arr.length;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
//      calculate prefix array values(sum);
        for(int index=1; index<arr.length; index++){
//                      previous values sum + current value
            prefix[index] = prefix[index-1] + arr[index];
        }

        for(int start=0; start<arr.length; start++){
            for(int end=start; end < arr.length; end++){
//              To calculate Max_Sub_Array_Sum;
                current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(max_sum<current_sum){
                    max_sum = current_sum;
                }
            }
        }

        System.out.println("Max Sum: " + max_sum);
    }
}

