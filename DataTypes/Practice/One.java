package com.DataTypes.Practice;
import java.util.*;
public class One {
    public static void main(String[] args) {
// 1 - In a program,input 3 numbers:A,B and C.You have to output the average of these 3 numbers.
        Scanner sc  = new Scanner(System.in);
//        INPUT
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
//        AVERAGE
        float avg =  (a+b+c)/3;
        System.out.println("AVG:" + avg);

    }
}
