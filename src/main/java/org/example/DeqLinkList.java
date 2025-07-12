package org.example;

import org.example.exception.EmptyDeqException;

public class DeqLinkList {

    private final LinkList list;

    public DeqLinkList() {
        list = new LinkList();
    }

    public void insertLeft(int num) {
        list.insertFirst(num);
    }

    public void insertRight(int num) {
        list.insertLast(num);
    }

    public int removeLeft() {
        if (list.isEmpty()) throw new EmptyDeqException();

        return list.removeFirst();
    }

    public int removeRight() {
        if (list.isEmpty()) throw new EmptyDeqException();

        return list.removeLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
