package com.stacks;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class StackTest extends TestCase {

    @Test
    public void testStack(){
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
