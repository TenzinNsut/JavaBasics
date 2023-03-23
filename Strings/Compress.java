package com.Strings;
import java.util.*;
public class Compress {
    public static void main(String[] args) {
       String str = "aaaabbcccdd";
        System.out.println(CompressString(str));
    }
    public static String CompressString(String str){
        StringBuilder sb = new StringBuilder("");

        for(int index = 0; index < str.length(); index++ ){
            Integer count = 1;
            while (index < str.length() - 1 && str.charAt(index) == str.charAt(index+1)){
                count++;
                index++;
            }
            sb.append(str.charAt(index));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
}
