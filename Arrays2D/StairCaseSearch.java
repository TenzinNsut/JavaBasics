package com.Arrays2D;
import java.util.*;
public class StairCaseSearch {
    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48 },
                          {32, 33, 39, 50}};
        int key = 33;
        Search(matrix,key);
    }
    public static boolean Search(int matrix[][], int key){
//      1.) find corner element of matrix
        int row = 0, col = matrix[0].length-1;
        while (col>= 0 && row < matrix.length){
            if(key == matrix[row][col]){
                System.out.println("Found at index (" + row + "," + col +")");
                return true;
            }
//          MOVE LEFT
            else if(key < matrix[row][col]){
                    col--;
            }
//          MOVE DOWN
            else{
                  row++;
            }
        }
        System.out.println("Item not found");
        return false;
    }
}
