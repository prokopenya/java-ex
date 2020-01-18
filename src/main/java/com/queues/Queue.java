package com.queues;

public class Queue<Item>  {

    private Node first, last;

    public Queue() {
        first = first;
        last = last;
    }

    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())
            first = last;
        else
            oldLast.next = last;
    }

    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public Item getFirstItem() {
        return first.item;
    }


    private class Node {
        Item item;
        Node next;
    }

}
