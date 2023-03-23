package com.Arrays;
import java.util.*;
public class TrappedWater {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Water = " + TrappedWater(height));
    }

    public static int TrappedWater(int height[]){
// 1.) Calculate left max and right max and store in auxiliary array;

//        int arr_lenght =  height.length;

//      create left_max auxiliary array.
        int left_max[] = new int[height.length];
        left_max[0] = height[0];
        for(int index=1; index<height.length; index++){
            left_max[index] = Math.max(height[index], left_max[index-1]);
        }

//      create right_max auxiliary array;
        int right_max[] = new int[height.length];
        right_max[height.length-1] = height[height.length-1];
        for(int index=height.length - 2; index >= 0; index--){
            right_max[index] = Math.max(height[index], right_max[index+1]);
        }

        int Trapped_water = 0;
        int width = 1;
//      Traverse original array;
        for(int index=0; index<height.length; index++){
//            calculate "water-level";
            int water_level =  Math.min(left_max[index],right_max[index]);
            Trapped_water += (water_level - height[index]) * width;
        }
        return Trapped_water;
    }
}
