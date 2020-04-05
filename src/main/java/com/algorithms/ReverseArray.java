package com.algorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {

    public ReverseArray() {
        throw new AssertionError("Instances of class isn't supported");
    }

    public static class StreamImpl {

        static <T> List<T> reverse(final List<T> list) {
            final int last = list.size() - 1;
            return IntStream.rangeClosed(0, last)
                    .map(i -> (last - i))
                    .mapToObj(list::get)
                    .collect(Collectors.toList());
        }

    }

    public static class IterativeImpl {

        public static <T> List<T> reverse(final List<T>  list) {
            for (int i = 0; i < list.size() / 2; i++) {
                T temp = list.get(i);
                list.set(i, list.get(list.size() - 1 - i));
                list.set(list.size() - 1 - i, temp);
            }
            return list;
        }
    }
}
