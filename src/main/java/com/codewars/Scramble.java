package com.codewars;

//https://www.codewars.com/kata/55c04b4cc56a697bb0000048
public class Scramble {

    public static boolean isScrambled(String str1, String str2) {

        for (String letter : str2.split("")) {
            if (str1.contains(letter)) {
                str1 = str1.replaceFirst(letter, "");
            } else return false;
        }
        return true;
    }
}
