package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {

    private LinkList list;

    @BeforeEach
    void init() {
        list = new LinkList();
    }

    @Test
    void insertRemoveLeft() {
        list.insertFirst(1);

        System.out.println(list);

        int expected = 1;
        int actual = list.removeFirst();

        assertEquals(expected, actual);
    }

    @Test
    void insertRemoveRight() {
        list.insertLast(1);

        System.out.println(list);

        int expected = 1;
        int actual = list.removeLast();

        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
    }
}
