package com.venma.datastructures;

public class Queue {

    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {

        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];
        front = (front + 1) % capacity;
        size--;

        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;
        int count = 0;

        while (count < size) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
            count++;
        }

        System.out.println();
    }
}