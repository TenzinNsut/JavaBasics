package com.Strings;
import java.util.*;
public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int index=1; index < fruits.length; index++){
//          Compare first and last ; (str1 < str2) < 0
            if(largest.compareToIgnoreCase(fruits[index]) < 0){
                largest =  fruits[index];
            }
        }

        System.out.println(largest);
    }
}
