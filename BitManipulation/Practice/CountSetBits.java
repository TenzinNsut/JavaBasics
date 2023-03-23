package com.BitManipulation.Practice;
import java.util.*;
public class CountSetBits {
    public static void main(String[] args) {
        int input = 10;
        System.out.println(CountBits(input));
    }
    public static int CountBits(int input){
        int count = 0;
        while (input>0){
//  Note: 0 & 1 -> 0;
//  Compare: (L.S.B & 1) != 0 -> count++
            if((input & 1) != 0){
                count++;
            }
//  Move(rightShit) L.S.B by 1; for each iteration;
            input = input>>1;
        }
        return count;
    }
}
