package com.algorithms;

import java.util.stream.Stream;

public final class ReverseString {

    public ReverseString() {
        throw new AssertionError("Instances of class isn't supported");
    }

    public static class StreamImpl {

        public static String reverse(String str) {
            return Stream.of(str.split("")).reduce("", (r, c) -> c + r);
        }

    }

    public static class IterativeImpl {

        public static String reverse(String str) {
            return str.chars()
                    .mapToObj(c -> (char)c)
                    .reduce("", (s,c) -> (c + s), (s1,s2) -> s2 + s1);
        }
    }

}
