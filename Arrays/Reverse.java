package com.Arrays;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int arr[] = {4,5,7,3,1};
        Reverse(arr);

//      Printing:
        for(int index=0; index<arr.length;index++){
            System.out.print( arr[index]+" ");
        }
    }

    public static void Reverse(int arr[]){
        int start_index = 0;
        int last_index = arr.length-1;

        while (start_index<last_index){

            int Temp = arr[start_index];
            arr[start_index] = arr[last_index];
            arr[last_index] = Temp;

            start_index++;
            last_index--;
        }
    }
}
