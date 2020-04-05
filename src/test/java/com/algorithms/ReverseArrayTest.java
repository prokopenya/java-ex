package com.algorithms;

import org.junit.BeforeClass;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest<T> {
                                                  //kek
    private List<T> inputValues = new ArrayList<>((Collection<? extends T>) Arrays.asList("test1", "test2", "test3"));;
    private List<T> expectedValues;

    @BeforeEach
    public void init() {
        expectedValues = new ArrayList<>(inputValues);
        Collections.reverse(expectedValues);
    }

    @Test
    public void should_reverse_array_stream_impl() {
        List<T> values = ReverseArray.StreamImpl.reverse(inputValues);
        assertEquals(expectedValues, values);
    }

    @Test
    public void should_reverse_array_iterative_impl() {
        List<T> values  = ReverseArray.IterativeImpl.reverse(inputValues);
        assertEquals(expectedValues, values);
    }

}