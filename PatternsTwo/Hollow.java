package com.PatternsTwo;

public class Hollow {

    public static void hollow(int row, int col){
        for(int r=1; r<=row; r++){
            for(int c=1; c<=col; c++){
//          Set boundary for (i,j)
                if(r==1||r==row||c==1 || c==col) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        hollow(4,5);
    }
}
