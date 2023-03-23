package com.BitManipulation;
import java.util.*;
public class CountSetBits {
    public static void main(String[] args) {
//      Find the number of '1' for the given input;
        int input = 14;
        System.out.println(setBits(input));
//      Note:
//      TimeComplexity -> O(log(n))
//      Total number of bits = log(n) + 1;
//      log(16) = 4 + 1 = 5(number of bits)

    }
    public static int setBits(int input){
        int count = 0;
        while(input>0){
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
