package com.Functions;
import  java.util.*;
public class Optimized {
    public static boolean isPrime(int n){
//      edge cases:
        if(n<=1) return false;
        if(n==2) return true;

        boolean isPrime = true;
        for(int i=2; i<Math.sqrt(n);i++){
            if (n % i == 0) return false;
        }
        return isPrime;

    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(0));
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(-2));
    }
}
