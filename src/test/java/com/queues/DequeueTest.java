package com.queues;

import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DequeueTest {

    @Test
    void addFirst() {
        Dequeue<String> que = new Dequeue<>();
        que.addFirst("1");
        que.addFirst("2");
        que.addFirst("3");

        assertEquals(3, que.size());
        assertEquals(false, que.isEmpty());

    }

    @Test
    void removeFirst() {
        Dequeue<String> que = new Dequeue<>();
        que.addFirst("1");
        que.addFirst("2");

        assertEquals("2", que.removeFirst());
        assertEquals("1", que.removeFirst());
        assertEquals(true, que.isEmpty());
    }

    @Test
    void addLast() {
        Dequeue<String> que = new Dequeue<>();
        que.addLast("1");
        que.addLast("2");
        assertEquals(2, que.size());

        try {
            que.addLast(null);
        } catch (NullPointerException e) {
            assertNotNull(e);
        } catch (Throwable e) {
            assertNull(e);;
        }
    }

    @Test
    void removeLast() {
        Dequeue<String> que = new Dequeue<>();
        que.addLast("1");
        que.addLast("2");

        assertEquals("2", que.removeLast());
        assertEquals("1", que.removeLast());
        assertEquals(true, que.isEmpty());
    }

    @Test
    void isEmpty() {
        Dequeue<String> que = new Dequeue<>();
        assertEquals(true, que.isEmpty());
    }

    @Test
    void size() {
        Dequeue<String> que = new Dequeue<>();
        assertEquals(0, que.size());
    }

    @Test
    void addFirstExceptionTest() {
        Dequeue<String> que = new Dequeue<>();
        try {
            que.addFirst(null);
        } catch (NullPointerException e) {
            assertNotNull(e);;
        } catch (Exception e) {
            assertNull(e);
        }
    }

    @Test
    void removeFirstExceptionTest() {
        Dequeue<String> que = new Dequeue<>();
        try {
            que.removeFirst();
        }  catch (
                NoSuchElementException e) {
            assertNotNull(e);
        } catch (Throwable e) {
            assertNull(e);;
        }
    }

    @Test
    void testDequeueWithOneElement() {
        Dequeue<String> que = new Dequeue<>();
        que.addFirst("1");
        que.removeFirst();
        assertEquals(true, que.isEmpty());

        que.addFirst("1");
        que.removeLast();
        assertEquals(true, que.isEmpty());
    }

    @Test
    void removeLastExceptionTest() {
        Dequeue<String> que = new Dequeue<>();

        try {
            que.removeLast();
        }  catch (NoSuchElementException e) {
            assertNotNull(e);
        } catch (Throwable e) {
            assertNull(e);;
        }
    }

}