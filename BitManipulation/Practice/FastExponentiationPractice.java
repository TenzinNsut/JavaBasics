package com.BitManipulation.Practice;
import java.util.*;
public class FastExponentiationPractice {
    public static void main(String[] args) {
        int constant = 5;
        int exponent = 0;
        System.out.println(Calculate(constant,exponent));
    }
    public static int Calculate(int constant, int exponent){
        int result = 1;

        while (exponent > 0){
//  Check: if(LSB is set)
            if((exponent & 1) != 0){
                result = result * constant;
            }
            constant = constant * constant;
//  RightShift: LSB by 1; for each iteration;
            exponent = exponent >>1;
        }
        return result;
    }
}
