package com.Functions;
import  java.text.*;
import java.util.Scanner;

public class Parameter {
//    METHOD - 1
//    public static void sum(double a, double b){
//        double add = a + b;
//        System.out.println(add);
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        sum(x,y);
//
//    }



//    METHOD - 2:
    public static double add(double a, double b){
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double addition = add(x,y);
        System.out.println(addition);

    }
}
