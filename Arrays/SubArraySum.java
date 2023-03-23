package com.Arrays;
import java.util.*;
public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        MaxSubArraySum(arr);
    }

    public static void MaxSubArraySum(int arr[]) {
        int current_sum=0; int max_sum = Integer.MIN_VALUE;

        for(int start=0; start < arr.length; start++){
            for(int end=start; end<arr.length; end++){
                current_sum = 0;
                for(int sum=start; sum<=end; sum++){
                    current_sum += arr[sum];
                    System.out.println(current_sum);
                    if(max_sum < current_sum){
                        max_sum = current_sum;
                    }
                }
            }
        }
        System.out.println("Max Sum:" + max_sum);


    }
}
