package offer;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) first = last;
        else oldLast.next = last;

        N++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if(isEmpty()) last = null;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
