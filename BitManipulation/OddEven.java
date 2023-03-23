package com.BitManipulation;
import javax.crypto.spec.PSource;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
//  Note:  input & bitmask(1) = 0(even)
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        OddEven(input);
    }
    public static void OddEven(int input){
        if((input & 1) == 0)
            System.out.println(input + " is Even");
        else
            System.out.println(input + " is Odd");

    }
}
