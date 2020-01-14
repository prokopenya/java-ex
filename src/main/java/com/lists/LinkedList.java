package com.lists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<Item> implements Iterable<Item> {

    private Node head;
    private int N;


    public LinkedList() {
        head = null;
        N = 0;
    }

    public void add(Item item){
        Node currentNode = head;
        Node newNode = new Node(item);
        if(isEmpty()){
            head = newNode;
            N++;
            return;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
        N++;
    }

    private boolean isEmpty() { return N == 0; }

    public int size() { return N; }

    public boolean remove(int index) {
        if (index < 0 || index > size()){
            return false;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current.next == null)
                return false;
            current = current.next;
        }
        return true;
    }

    public Iterator<Item> iterator()  { return new LinkedListIterator(); }

    public Item get(int index) throws IndexOutOfBoundsException{
        if (index <= 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            if (temp.next == null)
                return null;
            temp = temp.next;
        }
        return temp.item;
    }

    private class LinkedListIterator implements Iterator<Item> {
        private Node current = head;

        public boolean hasNext() {
            return current != null;
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Node next;
        Item item;

        public Node(Item item) {
            this.item = item;
            this.next = null;
        }

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
