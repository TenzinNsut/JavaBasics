package com.Patterns;
import  java.util.*;
public class HalfStar {
    public static void main(String[] args) {
        halfStar(4);

    }

    public static void halfStar(int n){
//        outer loop = number of rows:
        for(int row=1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
