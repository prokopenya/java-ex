package com.algorithms.search;

import com.algorithms.Factorial;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void should_return_searched_element() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,3,4,5,2,58,13,987));

        int value = BinarySearch.binarySearch(arr, 3);
        int expectedValue = 1;

        Collections.sort(arr);

        assertEquals(expectedValue, value);
    }
}