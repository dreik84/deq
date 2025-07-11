package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkListTest {

    @Test
    void insertLeft() {
        LinkList list = new LinkList();
        list.insertLeft(1);

        System.out.println(list);

        int expected = 1;
        int actual = list.removeLeft();

        assertEquals(expected, actual);
    }

    @Test
    void removeLeft() {
    }

    @Test
    void isEmpty() {
        LinkList list = new LinkList();

        assertTrue(list.isEmpty());
    }
}