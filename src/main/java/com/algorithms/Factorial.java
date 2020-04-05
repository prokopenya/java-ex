package com.algorithms;


import java.math.BigInteger;
import java.util.stream.LongStream;

public final class Factorial {

    public Factorial() {
            throw new AssertionError("Instances of class isn't supported");
        }

    public static class StreamImpl {

        public static long getFactorial(long n) {

            return LongStream.rangeClosed( 1, n )
                    .reduce(1, ( long a, long b ) -> a * b);

        }
    }

    public static class IterativeImpl {

        public static BigInteger getFactorial(BigInteger n) {
            BigInteger result = BigInteger.ONE;

            while (!n.equals(BigInteger.ZERO)) {
                result = result.multiply(n);
                n = n.subtract(BigInteger.ONE);
            }

            return result;
        }
    }
}
