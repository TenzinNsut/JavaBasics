package com.Arrays2D.Practice;
import java.util.*;
public class SpiralPractice {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        printSpiralMatrix(matrix);
    }
    public static int[][] printSpiralMatrix(int[][] matrix) {
        int startRow =0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while (startRow<=endRow && startCol<=endCol){
//            Top
            for(int col=startCol; col<=endCol; col++){
                System.out.print(matrix[startRow][col]+" ");
            }
//            Right
            for(int row=startRow+1; row <=endRow; row++){
                System.out.print(matrix[row][endCol]+" ");
            }
//            Bottom
            for(int col=endCol-1; col>=startCol; col--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][col]+" ");
            }
//            Left
            for(int row=endRow-1; row>=startRow+1; row--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[row][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
        return matrix;
    }
}

