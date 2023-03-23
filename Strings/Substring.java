package com.Strings;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        String str = "Tenzin";
        int startIndex=0;
        int endIndex=4;

        System.out.println(Substring(str, startIndex, endIndex));
//        or
        System.out.println(str.substring(startIndex,endIndex));
    }
    public static String Substring(String str, int startIndex, int endIndex){
        String substring = "";
        for(int index=startIndex; index < endIndex; index++){
            substring += str.charAt(index);
        }
        return substring;
    }

}
