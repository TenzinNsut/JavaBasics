package com.Loops;

import java.util.Scanner;

public class Nth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int count = 0;
        while (count<=n){
            System.out.print(count+" ");
            count++;
        }
    }
}
