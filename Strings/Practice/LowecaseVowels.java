package com.Strings.Practice;
import java.util.*;
public class LowecaseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Vowels:" + CountVowels(str));
    }
    public static int CountVowels(String str){
        int count = 0;
        for(int index=0; index < str.length(); index++){
            char ch = str.charAt(index);
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
}
