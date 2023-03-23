package com.Strings.Practice;
import java.util.*;
public class Intern {
    public static void main(String[] args) {
        String str1 = "Tenzin";
        String str2 = "Tenzin";
        String str3 = new String("Tenzin"); //(str1 != str3) -> false;
        System.out.println(str1==str2); // -> true
        System.out.println(str1==str3); // -> false

        String str4 = str3.intern();
        System.out.println(str1 == str4); // -> true

    }
}
