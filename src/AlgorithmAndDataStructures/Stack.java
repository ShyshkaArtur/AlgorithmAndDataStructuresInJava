package AlgorithmAndDataStructures;

import java.util.ArrayList;

/**
 * Stack implementation on an array of integers.
 */
public class Stack {

    private ArrayList<Integer> stack;
    private static int top = -1;

    /**
     * Creates a new Stack object with the specified capacity.
     */
    Stack() {
        stack = new ArrayList<>();
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param element the element to be pushed into the stack
     */
    public void push(int element) {
        System.out.println("В Стек добавлений елемент: " + element);
        ++top;
        stack.add(element);
    }

    /**
     * Pops the top element from the stack and returns it.
     * If the stack is empty, prints an error message and exits the program.
     * @return the top element of the stack
     */
    public void pop() {
        if(isEmpty()) {
            System.out.println("Стек порожній! (Неможливо видалити елемент)");
            System.exit(1);
        }
        System.out.println("Із Стеку був видалений елемент: " + stack.get(top));
        stack.remove(top--);
    }

    /**
     * Get element from the top of the stack without removing it
     * @return element from top of stack
     */
    public int peek() {
        if(isEmpty()) {
            System.out.println("Стек порожній!");
            System.exit(1);
        }
        return stack.get(top);
    }

    /**
     * Get the number of elements in the stack.
     * @return number of elements
     */
    public int size() {
        return stack.size();
    }

    /**
     * Returns whether or not the stack is empty.
     * @return true if the stack is full, false otherwise
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Print stack
     */
    public void printStack() {
        if(isEmpty()) {
            System.out.println("Стек порожній!");
            return;
        }
        System.out.print("Стек: ");
        for (int elementArray: stack) {
            System.out.print(elementArray + " ");
        }
    }
}
