package org.example;

import org.example.exception.EmptyDeqException;

public class DeqLinkList {

    private final LinkList list;

    public DeqLinkList() {
        list = new LinkList();
    }

    public void insertLeft(int num) {
        list.insertLeft(num);
    }

    public void insertRight(int num) {
        list.insertRight(num);
    }

    public int removeLeft() {
        if (list.isEmpty()) throw new EmptyDeqException();

        return list.removeLeft();
    }

    public int removeRight() {
        if (list.isEmpty()) throw new EmptyDeqException();

        return list.removeRight();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
