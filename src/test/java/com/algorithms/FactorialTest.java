package com.algorithms;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest  {

    @Test
    public void should_return_factorial_stream_impl() {
        long value = Factorial.StreamImpl.getFactorial(8);
        long expectedValue = 40320;

        assertEquals(expectedValue, value);
    }

    @Test
    public void should_return_factorial_iterative_impl() {
        BigInteger value = Factorial.IterativeImpl.getFactorial(new BigInteger("22"));
        BigInteger expectedValue = new BigInteger("1124000727777607680000");

        assertEquals(expectedValue, value);
    }
}