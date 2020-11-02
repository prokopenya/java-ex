package com.codewars;

public class MaxSequence {
    public static int sequence(int[] ints) {

        if (ints.length == 0) return 0;

        int result = ints[0];
        int sum = ints[0];

        for(int i=1; i<ints.length; i++){
            sum = Math.max(ints[i], sum + ints[i]);
            result = Math.max(result, sum);
        }

        if (result < 0) return 0;

        return result;
    }
}


//https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/java