package com.Strings;
import java.util.*;
public class UsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println("string length: " + sb.length() );
    }
}
