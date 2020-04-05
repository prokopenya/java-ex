package com.algorithms;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    public void should_return_sum_fib_numbers_stream_impl() {
        BigInteger value = Fibonacci.StreamImpl.sumFibonacciNumbers(5);
        int expectedValue = 7;

        assertEquals(expectedValue, value);
    }
    @Test
    public void should_return_list_fib_numbers_stream_impl() {
        List<Integer> value = Fibonacci.StreamImpl.getFibonacciList(11);
        List<Integer> expectedValue = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);

        assertEquals(expectedValue, value);
    }
    @Test
    public void should_return_list_fib_numbers_iterative_impl() {
        List<BigInteger> value = Fibonacci.IterativeImpl.getFibonacciList(5);
        List<BigInteger> expectedValue = new ArrayList<>();

        expectedValue.add(new BigInteger("0"));
        expectedValue.add(new BigInteger("1"));
        expectedValue.add(new BigInteger("1"));
        expectedValue.add(new BigInteger("2"));
        expectedValue.add(new BigInteger("3"));

        assertEquals(expectedValue, value);
    }
    @Test
    public void should_return_sum_fib_numbers_iterative_impl() {
        BigInteger value = Fibonacci.IterativeImpl.sumFibonacciNumbers(5);
        int expectedValue = 7;

        assertEquals(expectedValue, value);
    }


}