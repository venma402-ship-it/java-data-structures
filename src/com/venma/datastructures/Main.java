package com.venma.datastructures;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(7);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Removed: " + stack.pop());
        System.out.println("Removed: " + stack.pop());

        System.out.println("Stack size: " + stack.size());

        System.out.println("Stack elements:");
        stack.display();
    

// QUEUE TEST
 System.out.println("\n--- Queue Test ---");

Queue queue = new Queue(5);

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

System.out.println("Queue elements:");
queue.display();

System.out.println("Removed: " + queue.dequeue());

System.out.println("Queue after removal:");
queue.display();

System.out.println("\n--- Linked List Test ---");

LinkedList list = new LinkedList();

list.insert(10);
list.insert(20);
list.insert(30);
list.insert(40);

list.display();
System.out.println("\nLinked List size: " + list.size());

System.out.println("Search 20: " + list.search(20));
System.out.println("Search 100: " + list.search(100));

System.out.println("Deleting 20...");
list.delete(20);

list.display();

    }
}