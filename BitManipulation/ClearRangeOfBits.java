package com.BitManipulation;
import java.util.*;
public class ClearRangeOfBits {
    public static void main(String[] args) {
        int input = 10;
        int start = 2;
        int end =  4;
        System.out.println(ClearRange(input, start, end));
    }
    public static int ClearRange(int input, int start, int end){
//         Make certain range to bits -> 0
//         1.) a(M.S.B) - > (~0)<<end+1; -> 111100000000
//         2.) b(L.S.B) - > 1<<start-1;  -> 000000001111
//         3.) OR a | b -> 111100001111
//         4.) input & (a | b);

        int a = (~0)<<end+1;
        int b = 1<<start-1;
        int MaskBits = a | b;
        return input & MaskBits;

    }

}
