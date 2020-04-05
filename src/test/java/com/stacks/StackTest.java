package com.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StackTest{

    @Test
    public void should_change_size(){
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");

        assertEquals("three", stack.peek());
        assertEquals(3,stack.size());
        stack.pop();
        assertEquals("two",stack.peek());
    }

}
