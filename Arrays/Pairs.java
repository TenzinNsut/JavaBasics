package com.Arrays;
import java.util.*;
public class Pairs {
    public static void main(String[] args) {
        int arr[] = {2,5,7,8,9,20};
        pairs(arr);

    }

    public static void pairs(int arr[]){
        int Total_pairs = 0;
        for(int main_index=0; main_index<arr.length; main_index++){ //index  = n
            for(int next_index=main_index+1; next_index < arr.length; next_index++){ //index = n+1
                System.out.print("("+arr[main_index]+ "," + arr[next_index]+")");
                Total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs :" + Total_pairs);
//        Total pairs: n(n-1)/2 [arithmetic progression]
    }

}
