package com.Arrays;
import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        int arr[] =  {2,4,6,8,10};
        subarry(arr);
    }
    public static void subarry(int arr[]){

        for (int main_index=0; main_index < arr.length; main_index++){
            int start =  main_index;
            for(int new_index=main_index; new_index < arr.length; new_index++){
                int end = new_index;
                for(int print=start; print <=end; print++){
                    System.out.print(arr[print]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
//        for(int main_index=0; main_index< arr.length; main_index++){
//            for(int next_index=main_index; next_index < arr.length; next_index++){
////              printing index form: start=main_index | end=next_index;
//                for(int print=main_index; print<=next_index; print++ ){
//                    System.out.print(arr[print]+ " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }

    }
}
