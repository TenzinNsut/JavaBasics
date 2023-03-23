package com.Functions;

import java.util.Scanner;

public class CallByValue {
//   CallByValue: a copy of variable is passed insted of actual value
    public static void swap(int a, int b){
//       swap
        int temp = a;
        a = b;
        b = temp;

//      Print new values:
        System.out.println("from swap function: ");
        System.out.println("a =" + a);
        System.out.println("b =" + b);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        System.out.println("from main function: ");
        System.out.println("a =" + a);
        System.out.println("b =" + b);



    }
}
