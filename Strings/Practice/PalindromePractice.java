package com.Strings.Practice;
import java.util.*;
public class PalindromePractice {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Palindrome: " + isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        for(int index=0; index < str.length()/2; index++){
            if(str.charAt(index) != str.charAt(str.length()-1-index)){
                return false;
            }
        }
        return true;
    }
}
