package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeqTest {

    @Test
    void insertLeft() {
        Deq deq = new Deq(2);
        deq.insertLeft(5);
        int expected = 5;
        int actual = deq.removeLeft();

        assertEquals(expected, actual);
    }

    @Test
    void insertRight() {
        Deq deq = new Deq(2);
        deq.insertRight(5);
        int expected = 5;
        int actual = deq.removeRight();

        assertEquals(expected, actual);
    }

    @Test
    void removeLeft() {
    }

    @Test
    void removeRight() {
    }

    @Test
    void isEmpty() {
        Deq deq = new Deq(2);

        assertTrue(deq.isEmpty());
    }

//    @Test
//    void isFull() {
//        Deq deq = new Deq(2);
//        deq.insertLeft(2);
//        deq.insertRight(3);
//
//        assertTrue(deq.isFull());
//    }
}