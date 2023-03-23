package com.DataTypes.Practice;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
//        INPUT
        System.out.print("Pencil: ");
        float a = sc.nextFloat();
        System.out.print("Pen: ");
        float b = sc.nextFloat();
        System.out.print("Eraser: ");
        float c = sc.nextFloat();
//        bill
        float bill = a + b + c;
        System.out.println("Bill: " + bill);
    }
}
