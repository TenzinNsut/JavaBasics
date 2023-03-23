package com.Arrays2D.Practice;
import java.util.*;
public class StaricaseSearchPractice {
    public static void main(String[] args) {
//      Time Complexity O(n+m)
//      if (n>>m) then O(n) else O(m)
        int matrix[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48 },
                {32, 33, 39, 50}};
        int key = 37;
        Search(matrix,key);
    }
    public static boolean Search(int matrix[][], int key){
//      corner element
        int row = 0 , col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
//      check for element
            if (key == matrix[row][col]) {
                System.out.println("Found at index (" + row + "," + col+")");
                return true;
            }
//          MOVE LEFT
            else if (key < matrix[row][col])
                col--;

//          MOVE DOWN
            else
                row++;
        }
        System.out.println("Item not found");
        return false;
    }
}
