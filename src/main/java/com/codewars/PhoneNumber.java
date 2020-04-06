package com.codewars;

//https://www.codewars.com/kata/525f50e3b73515a6db000b83
public class PhoneNumber {
    public String getPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);

    }
}
