package com.venma.datastructures;

public class LinkedList {

    class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node head;

    // INSERT
    public void insert(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // DISPLAY
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // DELETE
    public void delete(int value) {

        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // SEARCH
    public boolean search(int value) {

        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // SIZE
    public int size() {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}