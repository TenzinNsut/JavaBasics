package com.Functions;
import java.util.*;
public class Product {
    public static int prod(int x, int y){
        int product = x * y;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int product = prod(x,y);
        System.out.println("Product = " + product);

    }
}
