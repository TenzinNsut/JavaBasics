package com.Operators.Arithmetic;
import  java.util.*;
public class Unary {
    public static void main(String[] args) {
        System.out.println("--PreIncrement--");
        int a = 10;
        int pre = ++a;
        System.out.println("a:"+ a);
        System.out.println("Pre:"+pre);

        System.out.println("--PostIncrement--");
        int c = 10;
        int post = c++;
        System.out.println("c:"+ c);
        System.out.println("Pre:"+post);



    }
}
