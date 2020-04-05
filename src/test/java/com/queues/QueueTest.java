package com.queues;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class QueueTest {
    @Test
    public void should_get_first_item() {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(5);
        queue.enqueue(2);
        queue.enqueue(9);

        queue.dequeue();
        assertEquals(2, (int)queue.getFirstItem());

    }
}