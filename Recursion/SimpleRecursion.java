package com.Recursion;
import java.util.*;
public class SimpleRecursion {
    public static void Fact(int num) {
//  Base Case:
        if(num==1){
            System.out.print(num);
            return;
        }
        Fact(num-1);
        System.out.print(num+" ");


    }

    public static void main(String[] args) {
        System.out.print("Enter Limit: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Fact(num);
    }
}
