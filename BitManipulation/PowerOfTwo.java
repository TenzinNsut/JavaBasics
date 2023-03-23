package com.BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        int input = 16;
        System.out.println(Check(input));
    }
    public static boolean Check(int input){
       return (input & (input-1)) == 0;
    }
}
