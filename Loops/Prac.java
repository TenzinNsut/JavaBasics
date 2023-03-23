package com.Loops;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int counter=0;
        int sum = 0;
        while (sum<n){
            sum = counter + 1;
            counter++;
        }
        System.out.println(sum);

    }
}
