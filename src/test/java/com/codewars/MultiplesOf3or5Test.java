package com.codewars;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

class MultiplesOf3or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3or5().solution(10));
        assertEquals(23, new MultiplesOf3or5().streamSolution(10));
    }
}