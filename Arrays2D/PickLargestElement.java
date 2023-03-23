package com.Arrays2D;
import java.util.*;
public class PickLargestElement {
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

        System.out.println("largest element: " + Largest(matrix) );
        System.out.println("Smallest element: " + Smallest(matrix) );

    }

    public static int Largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int row=0; row < matrix.length; row++ ){
            for(int column=0; column<matrix[0].length; column++){
                largest = Math.max(largest, matrix[row][column]);
            }
        }
        return largest;
    }

    public static int Smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int row=0; row<matrix.length; row++){
            for(int column=0; column<matrix[0].length; column++){
                smallest = Math.min(smallest,matrix[row][column]);
            }
        }
        return smallest;
    }
}
