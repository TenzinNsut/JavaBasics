package com.BitManipulation;
import java.util.*;
public class UpdateIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input =  sc.nextInt();
        int i = sc.nextInt();
        int newValue = sc.nextInt();
        System.out.println(UpdateBit(input, i, newValue));
    }
    public static int UpdateBit(int input, int i,int newValue){
//        int BitMask = 1;
//        if(newValue == 0){
//            return clearBit(input, i);
//        }else{
//            return setBit(input, i);
//        }

//         or
        input = clearBit(input, i);
        int BitMask = newValue<<i;
        return input | BitMask;
    }

    public static int clearBit(int input, int i){
        return input & ~(1<<i);
    }
    public static int setBit(int input, int i){
        return input | (1<<i);
    }

}
