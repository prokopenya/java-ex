package com.codewars;

public class Order {

    public static String order(String words) {

        String[] splited = words.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= splited.length; i++) {
            for (String str : splited) {
                if (str.contains(Integer.toString(i))) sb.append(str).append(" ");
            }
        }

        return sb.toString().trim();
    }

}
