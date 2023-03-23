package com.Arrays2D;
import java.util.*;
public class Search {
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

        search(matrix,5);
    }

    public static boolean search(int matrix[][], int key){
        for(int row=0; row < matrix.length; row++ ){
            for(int column=0; column<matrix[0].length; column++){
                if(matrix[row][column] == key){
                    System.out.println("Item found at index :" +"("+row+","+column+")");
                    return true;
                }
            }
        }
        System.out.println("Item not found");
        return false;
    }
}
