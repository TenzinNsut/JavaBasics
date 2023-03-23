package com.Arrays;
import java.util.*;
public class UpdateArray {
    public static void update(int arr[]){
        for(int input=0; input<arr.length;input++){
            System.out.print(arr[input] + 1 +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {25,55,25};

//      initial values
        System.out.println("--OLD--");
        for(int index=0; index<arr.length; index++){
            System.out.print( arr[index] + " ");
        }

        System.out.println();

//      update values
        System.out.println("--New--");
        update(arr);


    }
}
