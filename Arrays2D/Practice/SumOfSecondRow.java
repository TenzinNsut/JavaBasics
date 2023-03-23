package com.Arrays2D.Practice;
import java.util.*;
public class SumOfSecondRow {
    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},
                          {11,4,3},
                          {2,2,3}};
        System.out.print("Sum:" + SecondSum(matrix));
    }

    public static int SecondSum(int matrix[][]) {
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        int Total = 0;

        for (int col = startCol; col <= endCol; col++ ){
            Total += matrix[1][col];
        }
        return Total;
    }
}
