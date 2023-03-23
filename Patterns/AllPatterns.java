package com.Patterns;
import java.util.*;
public class AllPatterns {
    public static void main(String[] args) {
//        longSquare(5);
        flipedHalfStar(5);

    }

    public static void flipedHalfStar(int n){
        for(int row=1; row < n; row++){
            for(int col=1; col < n; col++){
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    public static void longSquare(int n){
//        outer loop = number of rows:
        for(int row=1; row <= n; row++){
            for(int col=1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
