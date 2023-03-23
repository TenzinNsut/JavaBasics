package com.Arrays;
import java.util.*;
public class Kadanes {

    public static void main(String[] args) {
//        int arr[] = {1,-2,6,-1,3};
        int arr[] = {-2,-4,-7,-1};
        MaxSumKadanes(arr);

//        KADANES algo. considers => all -ve = 0;
    }

    public static void MaxSumKadanes(int arr[]){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int index=0; index< arr.length; index++){
//      edge case: if all inputs are -ve -> pick smallest -ve value;
            if(current_sum >= 0){
                current_sum = current_sum + arr[index];
            }else
                current_sum = arr[index];

            max_sum = Math.max(current_sum,max_sum);
        }
        System.out.println("Max sum: " + max_sum);
    }

}

