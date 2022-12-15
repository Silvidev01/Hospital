package LinkedList;

import org.w3c.dom.Node;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        //constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }
}