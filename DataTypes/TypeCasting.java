package com.DataTypes;

import  java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
//        Type casting forcibly converting one compatible datatype to other.
//        float x = 2.230f;
//        int b = (int) x;
//        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your marks: ");
        float marks =  sc.nextFloat();
        int num = (int) marks;
        System.out.println(num);


    }
}
