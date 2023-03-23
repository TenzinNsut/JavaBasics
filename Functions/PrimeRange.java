package com.Functions;
import java.util.*;
public class PrimeRange {
    public static boolean isPrime(int number){
//      edge cases:
        if(number<=1) return false;
        if(number==2) return true;

        boolean isPrime = true;
        for(int i=2;i<Math.sqrt(number);i++)
            if(number % i == 0) return false;

        return isPrime;
    }

    public static void PrimeRange(int range){
        for(int counter=0; counter<=range; counter++)
            if(isPrime(counter)) System.out.print(counter+" ");

        System.out.println();
    }
    public static void main(String[] args) {
        PrimeRange(19);

    }
}
