package com.lists;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListTest extends TestCase {

    @Test
    public void testListSize() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        assertEquals(5, list.size());
        assertEquals(true, list.remove(2));
    }

    @Test
    public void testIteratorHasNext() {
        LinkedList<String> list1 = new LinkedList<String>();

        assertEquals(false, list1.iterator().hasNext());
    }

    @Test
    public void testIteratorThrowsNoSuchElementException() {
        LinkedList<String> list = new LinkedList<String>();
        boolean thrown = false;
        try {
            list.iterator().next();
        } catch (NoSuchElementException e) {
            thrown = true;
        }

        assertEquals(true, thrown);
    }

    @Test
    public void testIteratorUnsupportedOperationException() {
        LinkedList<String> list1 = new LinkedList<String>();
        boolean thrown = false;
        try {
            list1.iterator().remove();
        } catch (UnsupportedOperationException e) {
            thrown = true;
        }

        assertEquals(true, thrown);
    }

    @Test
    public void testListByAddAtIndex() {

        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        //list.add("5",2);
        assertEquals("2", list.get(2));
        assertEquals("4", list.get(3));

    }
}
