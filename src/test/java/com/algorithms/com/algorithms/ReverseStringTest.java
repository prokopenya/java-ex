package com.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    private String inputValue = "hello";
    private String expectedValue = "olleh";

    @Test
    public void should_reverse_string_iterative_impl(){
        String value = ReverseString.StreamImpl.reverse(inputValue);
        assertEquals(expectedValue,value);
    }

    @Test
    public void should_reverse_string_stream_impl(){
        String value = ReverseString.StreamImpl.reverse(inputValue);
        assertEquals(expectedValue,value);
    }
}