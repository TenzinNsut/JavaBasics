package com.Functions;
import java.util.*;
public class Binomial {

    public static int fact(int x){
        int hold_factorial = 1; //as 0*1 = 0

        for(int count=1; count<=x; count++){
            hold_factorial = hold_factorial * count;
        }

        return hold_factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        input:
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("r: ");
        int r = sc.nextInt();

//        factorials
        int n_fact = fact(n);
        int r_fact = fact(r);
        int n_m_r  = fact(n-r);

//        formula: n/r*(n-r)
        int binomial =  n_fact/(r_fact*n_m_r);
        System.out.println("Binomial = " + binomial);

    }
}
