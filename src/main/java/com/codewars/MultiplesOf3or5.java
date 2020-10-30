package com.codewars;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiplesOf3or5 {

    public int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int streamSolution(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0 || i % 5 == 0))
                .sum();
    }
}
