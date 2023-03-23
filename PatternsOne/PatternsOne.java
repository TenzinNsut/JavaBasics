package com.PatternsOne;
import java.util.*;
public class PatternsOne {
    public static void main(String[] args) {
//        halfStar(4);
//        invertedStart(4);
//        Square(4);
//        halfNumber(4);
//        invertedNumber(4);
        halfCharacter(4);

    }

    public static void halfStar(int input){
//        outer for loop =  number of rows
        for(int row=1; row<=input; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Square(int input){
        for(int row=1; row <= input; row++){
            for(int col=1; col <= input; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedStart(int input){
//        outer loop =  number of rows
        for(int row=1; row<=input; row++){
            for(int col=1; col<=input-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void halfNumber(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void invertedNumber(int n){
        for(int row=1; row <= n; row++){
            for(int col=1; col <= n-row+1; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }


    public static void halfCharacter(int n){
        char ch = 'A';
        for (int row=1; row <= n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
