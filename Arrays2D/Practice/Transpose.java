package com.Arrays2D.Practice;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        Transpose(matrix);
    }
    public static int[][] Transpose(int matrix[][]){
//      Just interchange loops for row and col;
        System.out.println("Transpose");
        for(int col=0; col <= matrix[0].length-1; col++){
            for (int row=0; row <= matrix.length-1; row++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
        return matrix;
    }
}
