package com.Arrays2D;
import java.util.*;
public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int NumRows = matrix.length;
        int NumColumns = matrix[0].length;

//      Input
        for(int row=0; row < NumRows; row++ ){
            for(int column =0; column < NumColumns; column++){
                matrix[row][column] = sc.nextInt();
            }
        }
//      Display
        for(int row=0; row < NumRows; row++ ){
            for(int column =0; column < NumColumns; column++){
                System.out.print(matrix[row][column] + "  ");
            }
            System.out.println();
        }
    }
}
