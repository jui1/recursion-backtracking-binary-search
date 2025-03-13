package Linkedlist;

public class Linkedlist {
    private Node head;
    private Node tail;
    private int size;

    // Constructor to initialize the linked list
    public Linkedlist() {
        this.size = 0;
    }

    // Method to insert a node at the beginning of the linked list
    public void insertFirst(int val) {
        Node node = new Node(val);  // Create a new node with the given value
        node.next = head;           // Make the current head the next node of the new node
        head = node;                // Update head to point to the new node

        if (tail == null) {         // If the list is empty, both head and tail are the new node
            tail = head;
        }

        size++;  // Increase the size of the list
    }

    // Method to insert a node at the end of the linked list
    public void insertLast(int val) {
        // If the list is empty, directly insert the value at the beginning
        if (tail == null) {  
            insertFirst(val);
            return;
        }

        Node node = new Node(val);  // Create a new node with the given value
        tail.next = node;           // Link the new node to the end of the list
        tail = node;                // Update the tail to the new node

        size++;  // Increase the size of the list
    }

    // Method to insert a node at a specific index in the linked list
    public void insert(int val, int index) {
        // Validate the index
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertFirst(val);  // Insert at the beginning
            return;
        }

        if (index == size) {
            insertLast(val);  // Insert at the end
            return;
        }

        // Insert at a specific index in the middle
        Node temp = head;
        for (int i = 1; i < index; i++) {  // Stop at the node before the desired index
            temp = temp.next;  // Move to the node just before the index
        }

        Node node = new Node(val);  // Create a new node
        node.next = temp.next;      // Link the new node to the next node
        temp.next = node;           // Link the previous node to the new node

        size++;  // Increase the size of the list
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");  // Mark the end of the list
    }

    // Node class to represent each element in the linked list
    private class Node {
        private int value;
        private Node next;

        // Constructor to create a new node with a value
        private Node(int value) {
            this.value = value;
            this.next = null;  // Initially, next is null
        }
    }
}
