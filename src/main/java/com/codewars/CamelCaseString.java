package com.codewars;

import java.util.Arrays;

//https://www.codewars.com/kata/517abf86da9663f1d2000003
public class CamelCaseString {
    public String getCamelCaseString(String str) {
            String[] words = str.split("[-_]");
            return Arrays.stream(words, 1, words.length)
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .reduce(words[0], String::concat);
    }
}
