package com.DataTypes;

import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("---------CALCULATE AREA OF CIRCLE----------");
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Radius: ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;

        System.out.println(area);
    }
}
