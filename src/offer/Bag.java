package offer;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node cur = first;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public Item next() {
            Item item = cur.item;
            cur = cur.next;
            return item;
        }
    }
}
