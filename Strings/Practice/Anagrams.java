package com.Strings.Practice;
import java.util.*;
public class Anagrams {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        str1.toLowerCase();
        str2.toLowerCase();
        System.out.println(CheckAnagram(str1, str2));
    }
    public static boolean CheckAnagram(String str1, String str2){
//       1.) Compare the lengths
        if(str1.length() == str2.length()){
//       2.) create char array;
            char[]  str1CharArray =  str1.toCharArray();
            char[]  str2CharArray =  str2.toCharArray();
//       3.) Sort the char arrays
             Arrays.sort(str1CharArray);
             Arrays.sort(str2CharArray);
//       4.) Compare the two sorted char[] arrays
             boolean result = Arrays.equals(str1CharArray,str2CharArray);
             if(result == true){
                 return true;
             }else{
                 return false;
             }
        }
        return false;
    }
}
