package com.BitManipulation;
import java.util.*;
public class ClearLastBits {
    public static void main(String[] args) {
        int input = 15;
        int noTimes = 2;
        System.out.println(ClearLast(input, noTimes));
    }
    public static int ClearLast(int input, int noTimes){
//         We want to make Last "i" No. of bits - > 0;
//        Note: (-1) or (~0) -> 11111111
        int MaskBit = (~0)<<noTimes;
        return input & MaskBit;

    }
}
