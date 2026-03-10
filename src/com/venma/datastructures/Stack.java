package com.venma.datastructures;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
    public void display() {

    if (isEmpty()) {
        System.out.println("Stack is empty");
        return;
    }

    for (int i = top; i >= 0; i--) {
        System.out.print(arr[i] + " ");
    }

    System.out.println();
}
}
