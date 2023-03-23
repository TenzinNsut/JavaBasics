package com.Strings.Practice;
import java.util.*;
public class CompressPractice {
    public static void main(String[] args) {
        String str = "aaacbbeww";
        System.out.println(CompressString(str));
    }
    public static String CompressString(String str){
        StringBuilder sb = new StringBuilder("");

        for(int index=0; index < str.length(); index++){
            Integer count = 1;
//          str.length-1 -> secondLastElement tak jana hai, so that we can compare; index and index+1;
            while (index < str.length()-1 && str.charAt(index) == str.charAt(index+1) ){
                count++;
                index++;
            }
            sb.append(str.charAt(index));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
}
