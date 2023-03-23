package com.BitManipulation;
import java.util.*;
public class SetIethBit {
    public static void main(String[] args) {
        int input = 10;
        int i = 2;
        SetBit(input, i);
    }
    public static int SetBit(int input, int i){
//      Make iBit -> 1
        int BitMask = 1;
        return input | BitMask<<i;
    }

}
