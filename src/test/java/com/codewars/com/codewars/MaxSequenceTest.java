package com.codewars;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class MaxSequenceTest {
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaxSequence.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6, MaxSequence.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void testNegativeArray() throws Exception {
        assertEquals("Example array should have a max of 0", 0, MaxSequence.sequence(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }

}