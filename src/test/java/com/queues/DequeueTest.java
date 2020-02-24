package com.queues;

import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DequeueTest {

    @Test
    void should_change_size() {
        Dequeue<String> que = new Dequeue<>();
        que.addFirst("1");
        que.addFirst("2");
        que.addFirst("3");

        assertEquals(3, que.size());
        assertEquals(false, que.isEmpty());

    }

    @Test
    void should_remove_first_element_from_dequeue() {
        Dequeue<String> que = new Dequeue<>();
        que.addFirst("1");
        que.addFirst("2");

        assertEquals("2", que.removeFirst());
        assertEquals("1", que.removeFirst());
        assertEquals(true, que.isEmpty());
    }

    @Test
    void should_add_last_element_in_dequeue() {
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
    void should_add_last_element_in_dequeue() {
        Dequeue<String> que = new Dequeue<>();
        que.addLast("1");
        que.addLast("2");

        assertEquals("2", que.removeLast());
        assertEquals("1", que.removeLast());
        assertEquals(true, que.isEmpty());
    }

    @Test
    void should_be_empty() {
        Dequeue<String> que = new Dequeue<>();
        assertEquals(true, que.isEmpty());
    }

    @Test
    void should_be_empty_by_size() {
        Dequeue<String> que = new Dequeue<>();
        assertEquals(0, que.size());
    }

    @Test
    void should_not_add_null_element() {
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
    void should_not_remove_first_element_from_empty_list() {
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
    void should_not_remove_last_element_from_empty_list() {
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