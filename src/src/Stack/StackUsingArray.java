package Stack;

public class StackUsingArray {

    // Define a Stack class
    static class Stack {
        private int[] stackArray;  // Array to store stack elements
        private int top;           // Index of the top element

        // Constructor to initialize the stack with a given size
        public Stack(int size) {
            stackArray = new int[size];
            top = -1;  // Indicates that the stack is empty
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Method to check if the stack is full
        public boolean isFull() {
            return top == stackArray.length - 1;
        }

        // Method to push an element onto the stack
        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack overflow. Unable to push " + data);
                return;
            }
            stackArray[++top] = data;
        }

        // Method to pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow. Unable to pop");
                return -1; // Indicates that the stack is empty
            }
            return stackArray[top--];
        }

        // Method to peek at the top element of the stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Nothing to peek");
                return -1; // Indicates that the stack is empty
            }
            return stackArray[top];
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack with a capacity of 5

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Popped element: " + stack.pop()); // Should show underflow message

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
