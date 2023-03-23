package com.Strings;
import java.util.*;
public class Compare {
    public static void main(String[] args) {
        String s1 = "Raj";
        String s2 = "Raj";
        String s3 = new String("Raj");
//        Note:
//        String s1,s2 point to the same STRING("Raj");
//        String s3 generates completely separate STRING("Raj");

//      TO compare strings with "new" keyword
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }




    }
}


// OUTPUT:  Strings are not equal;
//        if(s1==s3){
//            System.out.print("STRINGS ARE EQUAL");
//        }else{
//            System.out.println("STRINGS ARE NOT EQUAL");
//        }
