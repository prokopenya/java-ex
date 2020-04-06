package com.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://www.codewars.com/kata/58223370aef9fc03fd000071
public class Dash {

    public String DashatizeIt(int n) {
        return Arrays.stream(String.valueOf(Math.abs(n)).split(""))
                .map(x -> Integer.valueOf(x) % 2 == 0 ? x : "-" + x + "-")
                .collect(Collectors.joining(""))
                .replaceAll("--", "-")
                .replaceAll("^-|-$", "");
    }
}

