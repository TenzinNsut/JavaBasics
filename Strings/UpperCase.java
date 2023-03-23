package com.Strings;
import java.util.*;
public class UpperCase {
    public static void main(String[] args) {
       String str = "hi, i am tenzin";
        System.out.println(ToUpperCase(str));
    }
    public static String ToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int index=1; index < str.length(); index++){
            if(str.charAt(index) == ' ' && index < str.length()-1){
                sb.append(str.charAt(index));
                index++;
                sb.append(Character.toUpperCase(str.charAt(index)));
            }else{
                sb.append(str.charAt(index));
            }
        }
        return sb.toString();
    }
}
