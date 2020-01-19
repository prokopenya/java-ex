package com.queues;

import java.util.NoSuchElementException;

public class Dequeue<Item> {

    private Node first, last;
    private int size = 0;

    public Dequeue() {
        first = null;
        last = null;
    }

    public void addFirst(Item item){
        if (item == null)
            throw new NullPointerException("null values cannot be inserted.");
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        first.prev = null;
        if (last == null)
            last = first;
        else
            oldFirst.prev = first;
        size++;
    }

    public Item removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("no element exists on deque.");

        Item item = first.item;
        if (first == last)
            first = last = null;
        else {
            first = first.next;
            first.prev = null;
        }
        size--;
        return item;
    }
    public void addLast(Item item){
        if (item == null)
            throw new NullPointerException("null values cannot be inserted.");
        if(isEmpty())
            addFirst(item);
        else{
            Node oldLast = last;
            last = new Node();
            last.item = item;
            last.next = null;
            last.prev = oldLast;
            oldLast.next = last;
            size++;
        }
    }

    public Item removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("no element exists on deque.");
        Item item = last.item;
        if (first == last)
            first = last = null;
        else {
            last = last.prev;
            last.next = null;
        }
        size--;
        return item;
    }


    public boolean isEmpty() {
        return first == null && last == null;
    }

    public int size() {
        return size;
    }

    private class Node {
        Item item;
        Node next;
        Node prev;
    }
}
