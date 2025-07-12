package org.example;

import java.util.StringJoiner;

public class LinkList {

    private static class Node {
        Node next;
        Node previous;
        int value;

        Node(int num) {
            value = num;
        }
    }

    private Node first;
    private Node last;

    public void insertFirst(int num) {
        Node node = new Node(num);

        if (isEmpty()) {
            last = node;
        } else {
            first.previous = node;
        }

        node.next = first;
        first = node;
    }

    public void insertLast(int num) {
        Node node = new Node(num);

        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
            node.previous = last;
        }

        last = node;
    }

    public int removeFirst() {
        int temp = first.value;

        if (first.next == null) {
            first = null;
            last = null;
        } else {
            first = first.next;
            first.previous = null;
        }

        return temp;
    }

    public int removeLast() {
        int temp = last.value;

        if (first.next == null) {
            first = null;
            last = null;
        } else {
            last = last.previous;
            last.next = null;
        }

        return temp;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        Node currentNode = first;
        StringJoiner sj = new StringJoiner(", ");

        while (currentNode != null) {
            sj.add(String.valueOf(currentNode.value));
            currentNode = currentNode.next;
        }

        return String.format("[%s]", sj);
    }
}
