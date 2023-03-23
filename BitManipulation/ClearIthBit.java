package com.BitManipulation;
import java.util.*;
public class ClearIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(ClearBit(input, i));
    }
    public static int ClearBit(int input, int i){
//      Make iBit -> 0;
        int BitMask = 1;
        return input & ~(BitMask<<i);
    }
}
