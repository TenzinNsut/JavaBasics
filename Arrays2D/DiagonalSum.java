package com.Arrays2D;
import java.util.*;
public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.print("Sum: "+FindDiagonalSum(matrix));
    }
    public static int FindDiagonalSum(int[][] matrix){
        int Total = 0;
        for(int index =0; index < matrix.length; index++){
//            Primary Diagonal
            Total += matrix[index][index];
//            Overlapping Condition (repeated) | row != col -> matrix.length-1-row;
            if (index != matrix.length - 1 - index )
                Total += matrix[index][matrix.length - 1 - index];
        }

        return Total;
    }
}

// B R U T E - F O R C E
//
//    int Total = 0;
//        for(int row = 0; row < matrix.length; row++){
//        for(int col=0; col < matrix[0].length; col++){
////              Primary Diagonal
//        if(row == col){
//        Total +=  matrix[row][col];
//        }
////              Secondary Diagonal
//        else if(row+col == matrix.length-1){
//        Total +=  matrix[row][col];
//        }
//        }
//        }