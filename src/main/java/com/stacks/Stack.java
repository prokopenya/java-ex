package com.stacks;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<Item> implements Iterable<Item> {

    private Node first;

    public Stack() {
        first = null;
    }

    public void push(Item item) {
        Node temp = first;
        first = new Node();
        first.item = item;
        first.next = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    public int size() {
        int count = 0;
        for (Item item : this){
            count++;
        }
        return count;
    }

    public Item peek() {
        if(isEmpty())
            throw new NoSuchElementException("No item present on stack");
        Item item = first.item;
        return item;
    }

    public Item pop() {
        if(isEmpty())
            throw new NoSuchElementException("No item present on stack");
        Item item = first.item;
        first = first.next;
        return item;
    }

    private boolean isEmpty() { return (first == null);}

    public void clear() {
        first = null;
    }

    private class StackIterator implements Iterator<Item> {

        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
            throw new UnsupportedOperationException("Remove operation not supported on stack");
        }
    }

    private class Node {
        Item item;
        Node next;
    }
}
