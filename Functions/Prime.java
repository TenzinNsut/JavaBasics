package com.Functions;

public class Prime {

    public static boolean isPrime(int n){

//      edge case: -> no negative number can be prime;
        if(n<0) return false;

//      isPrime, if number is divisible by '1' and 'itself';
//      So just check from 2->n-1;
        boolean isPrime = true;
        for(int i=2; i<n; i++){
            if(n%i == 0) return false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));

    }
}
