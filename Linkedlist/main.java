package Linkedlist;

public class main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        // Insert nodes at the beginning
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(90);
        list.display();  // Output: 90 -> 5 -> 6 -> END

        // Insert nodes at the end
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.display();  // Output: 90 -> 5 -> 6 -> 1 -> 2 -> 3 -> 4 -> 5 -> END

        // Insert a node at a specific index
        list.insert(100, 5);  // Insert 100 at index 5
        list.display();  //
    }
    
}
