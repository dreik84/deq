package org.example;

import org.example.exception.DeqOverflowException;
import org.example.exception.EmptyDeqException;

import java.util.Arrays;

public class Deq {

    private final int[] deququ;
    private int size;
    private int left;
    private int right;

    public Deq(int maxSize) {
        deququ = new int[maxSize];
        size = 0;
        left = -1;
        right = -1;
    }

    public void insertLeft(int num) {

        if (isFull()) throw new DeqOverflowException();

        left = (left == -1) ? deququ.length - 1 : left - 1;
        deququ[left] = num;
        size++;

        System.out.println(Arrays.toString(deququ)); // diagnostic
    }

    public void insertRight(int num) {

        if (isFull()) throw new DeqOverflowException();

        right = (right == deququ.length - 1) ? 0 : right + 1;
        deququ[right] = num;
        size++;

        System.out.println(Arrays.toString(deququ)); // diagnostic
    }

    public int removeLeft() {

        if (isEmpty()) throw new EmptyDeqException();

        int res = deququ[left];
        left = (left == deququ.length - 1) ? 0 : left + 1;
        size--;

        System.out.println(Arrays.toString(deququ)); // diagnostic
        return res;
    }

    public int removeRight() {

        if (isEmpty()) throw new EmptyDeqException();

        int res = deququ[right];
        right = (right == 0) ? deququ.length - 1 : right - 1;
        size--;

        System.out.println(Arrays.toString(deququ)); // diagnostic
        return res;
    }


    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == deququ.length);
    }

    @Override
    public String toString() {
        return "Deq{" +
                "deququ=" + Arrays.toString(deququ) +
                '}';
    }
}
