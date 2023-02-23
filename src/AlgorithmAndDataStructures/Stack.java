package AlgorithmAndDataStructures;

/**
 * Stack implementation on an array of integers.
 */
public class Stack {

    private int[] stack;
    private static int top = -1;
    private int capacity;

    /**
     * Creates a new Stack object with the specified capacity.
     * @param size the maximum capacity of the stack
     */
    Stack(int size) {
        stack = new int[size];
        capacity = size;
    }

    /**
     * Pushes an element onto the top of the stack.
     * If the stack is full, prints an error message and exits the program.
     * @param element the element to be pushed onto the stack
     */
    public void push(int element) {
        if(isFull()) {
            System.out.println("Стек заповнений! (Неможливо дабавити елемнет)");
            System.exit(1);
        }
        System.out.println("В Стек добавлений елемент: " + element);
        stack[++top] = element;
    }

    /**
     * Pops the top element from the stack and returns it.
     * If the stack is empty, prints an error message and exits the program.
     * @return the top element of the stack
     */
    public int pop() {
        if(isEmpty()) {
            System.out.println("Стек порожній! (Неможливо видалити елемент)");
            System.exit(1);
        }
        System.out.println("Із Стеку був видалений елемент: " + stack[top]);
        return stack[top--];
    }

    /**
     * Returns element from the top of the stack without removing it
     * @return element from top of stack
     */
    public int peek() {
        if(isEmpty()) {
            System.out.println("Стек порожній!");
            System.exit(1);
        }
        return stack[top];
    }

    /**
     * Returns the number of elements in the stack.
     * @return number of elements
     */
    public int size() {
        return top + 1;
    }

    /**
     * Returns whether or not the stack is empty.
     * @return true if the stack is full, false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns whether or not the stack is full.
     * @return true if the stack is empty, false otherwise
     */
    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        if(isEmpty()) {
            System.out.println("Стек порожній!");
            return;
        }
        System.out.print("Стек: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }

}
