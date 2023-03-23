package com.BitManipulation;
import java.util.*;
public class FastExponentiation {
    public static void main(String[] args) {
        int constant = 5;
        int exponent = 3;
        System.out.println(Calculate(constant,exponent));
    }
    public static int Calculate(int constant, int exponent){
        int result = 1; // 1 -> so that multiplication wouldn't make result -> 0;
        while (exponent > 0){
//  Compare: if(LSB & 1 != 0) -> setBit(1);
            if((exponent & 1) != 0){
                result = result * constant;
            }
            constant = constant * constant;
//  Move(RightShift) after each iteration
            exponent = exponent>>1;
        }
        return result;
    }
}
