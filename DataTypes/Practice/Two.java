package com.DataTypes.Practice;
import java.util.*;
public class Two {
    public static void main(String[] args) {
// 2 - In a program, input the side of a square.You have to output the area of the square.
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter side: ");
        float side = sc.nextFloat();
//        AREA
        float area =  side * side;
        System.out.println("Area: " + area);


    }
}
