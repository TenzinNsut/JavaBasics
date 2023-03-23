package com.Strings;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        Check(str);
    }
    public static boolean Check(String str){
//       Better approach
        for(int index = 0; index < str.length()/2; index++){
//          Compare first index and last index elements
            if(str.charAt(index) != str.charAt(str.length() - 1 - index)) {
                System.out.println("Is Not Palindrome");
                return false;
            }
        }
        System.out.println("Is Palindrome");
        return true;
    }
}

//       for(int index=0; index < str.length()/2; index++){
////          Compare first index and last index elements
//        if(str.charAt(index) == str.charAt(str.length() - 1 - index)){
//        System.out.println("It is a palindrome");
//        return true;
//        }
//        }
//        System.out.println("Not a palindrome");
//        return false;