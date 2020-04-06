package com.codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//https://www.codewars.com/kata/543bfbecdef6345f52000e4d/
public class Encrypt implements Encoder {
    static final Map<Character, String> dictionary = new HashMap<>();

    static {
        dictionary.put('a', "4");
        dictionary.put('e', "3");
        dictionary.put('l', "1");
        dictionary.put('m', "/^^\\");
        dictionary.put('o', "0");
        dictionary.put('u', "(_)");
    }

    @Override
    public String encode(String source) {
        return source == null ? "" : source.chars().mapToObj(c -> dictionary.getOrDefault(Character.toLowerCase((char) c), String.valueOf((char) c))).collect(Collectors.joining());
    }
}

interface Encoder {
    String encode(String source);
}