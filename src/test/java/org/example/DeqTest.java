package org.example;

import org.example.exception.DeqOverflowException;
import org.example.exception.EmptyDeqException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeqTest {

    private Deq deq;

    @BeforeEach
    void init() {
        deq = new Deq(2);
    }

    @Test
    void insertLeft() {
        deq.insertLeft(5);
        int expected = 5;
        int actual = deq.removeLeft();

        assertEquals(expected, actual);
    }

    @Test
    void insertRight() {
        deq.insertRight(5);
        int expected = 5;
        int actual = deq.removeRight();

        assertEquals(expected, actual);
    }

    @Test
    void removeLeft() {
        deq.insertLeft(2);
        deq.insertRight(3);

        deq.removeLeft();
        deq.removeLeft();
    }

    @Test
    void removeRight() {
        deq.insertLeft(2);
        deq.insertRight(3);

        deq.removeRight();
        deq.removeRight();
    }

    @Test
    void isEmpty() {
        assertTrue(deq.isEmpty());
    }

    @Test
    void isFull() {
        deq.insertLeft(2);
        deq.insertRight(3);

        assertTrue(deq.isFull());
    }

    @Test
    void insertEmptyDeq() {
        assertThrows(EmptyDeqException.class, deq::removeLeft);
        assertThrows(EmptyDeqException.class, deq::removeRight);
    }

    @Test
    void insertFullDeq() {
        deq.insertRight(1);
        deq.insertLeft(2);

        assertThrows(DeqOverflowException.class, () -> deq.insertRight(3));
        assertThrows(DeqOverflowException.class, () -> deq.insertLeft(4));
    }
}
