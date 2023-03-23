package com.Functions;
import java.util.*;
public class Factorial {

    public static int fact(int n){
        int hold_factorial = 1;

        for(int counter=1; counter<=n; counter++){
            hold_factorial = hold_factorial * counter;
        }

        return hold_factorial;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int value_of_factorial  = fact(n);
        System.out.println("factorial =" +value_of_factorial);


    }
}
