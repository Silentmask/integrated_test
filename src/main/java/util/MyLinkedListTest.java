package util;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest extends Object {

    @org.junit.jupiter.api.BeforeEach
    void setUp()throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() throws Exception{
    }

    @org.junit.jupiter.api.Test
    void add() {
        MyLinkedList list = new MyLinkedList();
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        list.add(i1);
        list.add(i2);
        assertEquals(2,list.size());
    }

    @org.junit.jupiter.api.Test
    void remove() {
        MyLinkedList list = new MyLinkedList();
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        list.add(i1);
        list.add(i2);
        list.remove(0);
        assertEquals(1,list.size());
        //assertEquals(2,list.size());
    }

    @org.junit.jupiter.api.Test
    void push() {
        MyLinkedList list = new MyLinkedList();
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        list.add(i1);
        list.add(i2);
        assertEquals(2,list.size());
    }
}