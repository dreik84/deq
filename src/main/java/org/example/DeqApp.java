package org.example;

public class DeqApp {
    public static void main(String[] args) {

        Deq deq = new Deq(10);

        deq.insertRight(1);
        deq.insertRight(2);
        deq.insertRight(3);
        deq.insertRight(4);
        deq.insertRight(5);

//        System.out.println(deq.removeLeft());

        deq.insertLeft(55);
        deq.insertLeft(66);
        deq.insertLeft(77);
        deq.insertLeft(88);
        deq.insertLeft(99);

        System.out.println(deq.removeLeft());
        System.out.println(deq.removeRight());

        System.out.println(deq);
    }
}
