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
        list.insertLeft(1);

        System.out.println(list);

        int expected = 1;
        int actual = list.removeLeft();

        assertEquals(expected, actual);
    }

    @Test
    void insertRemoveRight() {
        list.insertRight(1);

        System.out.println(list);

        int expected = 1;
        int actual = list.removeRight();

        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
    }
}
