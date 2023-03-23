package com.Loops;
import  java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        int counter = 0;
        int num = 0;

        while (counter<=n){
            num += counter;
            counter++;
        }
        System.out.print(num+" ");

    }
}
