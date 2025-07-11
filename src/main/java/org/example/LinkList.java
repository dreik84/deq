package org.example;

public class LinkList {

    class Node {
        Node next;
        Node previous;
        int value;

        Node(int num) { value = num; }
    }

    public Node first;
    public Node last;

    public void insertLeft(int num) {
        Node node = new Node(num);

        if (isEmpty()) {
            last = node;
        } else {
            first.previous = node;
        }

        node.next = first;
        first = node;
    }

    public int removeLeft() {
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

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString() {
        Node currentNode = first;
        StringBuilder sb = new StringBuilder();

        while (currentNode != null) {
            sb.append(currentNode.value);
            currentNode = currentNode.next;
        }

        return sb.toString();
    }

}
