package org.example;

import org.example.exception.EmptyDeqException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeqLinkListTest {

    private DeqLinkList deq;

    @BeforeEach
    void init() {
        deq = new DeqLinkList();
    }

    @Test
    void insertRemoveLeft() {
        deq.insertLeft(1);

        int expected = 1;
        int actual = deq.removeLeft();

        assertEquals(expected, actual);
    }

    @Test
    void insertRemoveRight() {
        deq.insertRight(1);

        int expected = 1;
        int actual = deq.removeRight();

        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        assertTrue(deq.isEmpty());
    }

    @Test
    void removeLeftThrown() {
        assertThrows(EmptyDeqException.class, deq::removeLeft);
    }

    @Test
    void removeRightThrown() {
        assertThrows(EmptyDeqException.class, deq::removeRight);
    }
}
