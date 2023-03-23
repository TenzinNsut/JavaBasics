package com.BitManipulation;
import java.util.*;
public class GetiethBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(GetIthBit(input, i));

    }
    public static int GetIthBit(int input, int i){
        int BitMask = 1;
        if((input & (BitMask<<i)) == 0)
            return 0;
        else
            return 1;
    }
}
