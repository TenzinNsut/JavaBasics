package com.Arrays;
import java.util.*;
public class LargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  new int[5];
        for(int input=0; input<arr.length; input++){
            arr[input] = sc.nextInt();
        }
        MinMax(arr);
    }

    public static void MinMax(int arr[]){
        int largest = Integer.MIN_VALUE; // -(infinity)
        int smallest = Integer.MAX_VALUE;

        for(int index=0; index < arr.length; index++){
            if(arr[index] > largest)
                largest = arr[index];
            if(arr[index] < smallest)
                smallest = arr[index];
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);

    }
}
