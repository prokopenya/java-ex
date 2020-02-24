package bags;


import java.util.Iterator;

/**
 *
 * Bag data structure is used to store collection of items
 * irrespective of fashion they inserted. It allows user to add an item
 * and iterate over the collection of items, determine the size etc.
 * But it does not support removal of item from Bag.
 *
 **/

public class Bag<Item> implements Iterable<Item> {
    private Item[] contents;
    private int N;

    public Bag() {
        contents = (Item[]) new Object[1];
        N = 0;
    }

    public void add(Item item) {
        if (item == null)
            throw new NullPointerException("You cannot fool us with null insertion");
        if (N == contents.length)
            resize(contents.length * 2);
        contents[N++] = item;
    }

    private void resize(int size) {
        Item[] items = (Item[]) new Object[size];
        for (int i = 0; i < N; i++) {
            items[i] = contents[i];
        }
        contents = items;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<Item> {
        private int current;

        public BagIterator() {
            current = 0;
        }

        public boolean hasNext() {
            return current != N;
        }

        public Item next() {
            return contents[current++];
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation not supported :(");
        }

    }
}
