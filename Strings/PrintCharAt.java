package com.Strings;
import java.util.*;
public class PrintCharAt {
    public static void main(String[] args) {
        String name = "Tenzin";
        PrintCharacters(name);
    }
    public static void PrintCharacters(String name){
        for(int index=0; index<name.length(); index++){
            System.out.print(name.charAt(index) + " ");
        }
    }
}
