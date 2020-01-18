package com.queues;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

class QueueTest extends TestCase {
    @Test
    public void testQueue() {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(9);

        queue.dequeue();
        assertEquals(2, (int)queue.getFirstItem());

    }
}