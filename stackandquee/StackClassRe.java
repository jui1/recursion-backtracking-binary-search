package stackandquee;

public class StackClassRe {
    public static void main(String[] args) {
        StackClassRe stack = new StackClassRe(5);
        stack.push(23);
        stack.push(45);
        stack.push(45);
        stack.push(45);
        stack.push(45);
        stack.push(45); // This will fail as the stack size is 5
        stack.push(45); // This will also fail
        stack.push(0); // This will also fail

        try {
            System.out.println(stack.pop()); // Should print the last pushed item
        } catch (StackException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(stack.peek()); // Peek at the top item
        } catch (StackException e) {
            System.out.println(e.getMessage());
        }
    }

    protected int[] data;
    private static final int SIZE = 10; // Changed to uppercase for convention
    int ptr = -1;

    public StackClassRe() {
        this(SIZE);
    }

    public StackClassRe(int size) {
        this.data = new int[size];
    }

    // Push an item onto the stack
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full!!");
            return false; // Cannot push the item if stack is full
        }
        data[++ptr] = item; // Increase pointer and add item to stack
        return true;
    }

    // Pop an item from the stack
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!");
        }
        return data[ptr--]; // Return the item at the top and then decrease pointer
    }

    // Peek at the top item of the stack
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!");
        }
        return data[ptr]; // Return the top item without modifying the stack
    }

    // Check if the stack is full
    private boolean isFull() {
        return ptr == data.length - 1; // If pointer is at the last index
    }

    // Check if the stack is empty
    private boolean isEmpty() {
        return ptr == -1; // If pointer is at -1, stack is empty
    }

    // Custom exception class
    public static class StackException extends Exception {
        public StackException(String message) {
            super(message);
        }
    }
}
