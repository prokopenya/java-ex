package com.algorithms;

import jdk.jshell.spi.ExecutionControl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//perfomance is ignored
public final class Fibonacci {

    public Fibonacci() {
        throw new AssertionError("Instances of class isn't supported");
    }

    public static class StreamImpl {

        public static List<Integer> getFibonacciList(int n) {
            return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                    .limit(n)
                    .map(x -> x[0])
                    .collect(Collectors.toList());
        }
        public static BigInteger sumFibonacciNumbers(int n) {
            return BigInteger.valueOf(Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                    .limit(n)
                    .map(t -> t[0])
                    .mapToInt(t -> t)
                    .sum());
        }

    }
    // 0 1 1 2 3
    public static class IterativeImpl {

        public static List<BigInteger> getFibonacciList(int n) {

            List<BigInteger> numbers = new ArrayList<>();
            numbers.add(new BigInteger("0")); numbers.add(new BigInteger("1"));

            for (int i = 1; i < n - 1; i++) {
                numbers.add(numbers.get(i).add(numbers.get(i - 1)));
            }
            return numbers;
        }
        public static BigInteger sumFibonacciNumbers(int n) {

            List<BigInteger> numbers = new ArrayList<>();
            BigInteger sum = BigInteger.ZERO;

            numbers = getFibonacciList(n);
            for (BigInteger item : numbers) {
                sum = sum.add(item);
            }

            return sum;
        }

    }

    public static class RecursiveImpl {

        public static List<BigInteger> getFibonacciList(int n) throws ExecutionControl.NotImplementedException {
            throw new ExecutionControl.NotImplementedException("Not developed yet");
        }
        public static BigInteger sumFibonacciNumbers(int n) throws ExecutionControl.NotImplementedException {
            throw new ExecutionControl.NotImplementedException("Not developed yet");
        }

    }

}
