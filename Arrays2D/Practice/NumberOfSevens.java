package com.Arrays2D.Practice;
import java.util.*;
public class NumberOfSevens {
    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};
        int num = 7;
        System.out.println("Total: " + Repeated(matrix,num));
    }
    public static int Repeated(int matrix[][], int num){
        int Total = 0;

        for(int row=0; row < matrix.length; row++ ){
            for(int col=0; col < matrix[0].length; col++){
                if( num == matrix[row][col]){
                    Total++;
                }
            }
        }
        return Total;
    }
}
