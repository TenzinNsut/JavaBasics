package com.BitManipulation.Practice;
import java.util.*;
public class SwapWithNoThirdVariable {
    public static void main(String[] args) {
//      Swap two number without using any third variable;
        int x = 3, y = 4;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }
}
