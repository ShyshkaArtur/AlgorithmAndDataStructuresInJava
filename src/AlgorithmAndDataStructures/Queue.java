package AlgorithmAndDataStructures;

import java.util.ArrayList;

public class Queue {

    private ArrayList<Integer> queue;
    private static int rear, front;

    Queue() {
        queue = new ArrayList<>();
        front = -1;
        rear = -1;
    }

    public void enQueue(int element) {
        if(front == -1) {
            front = 0;
        }
        rear++;
        System.out.println("В Чергу добавлений елемент: " + element);
        queue.add(element);
    }

    public void deQueue() {
        if(isEmpty()) {
            System.out.println("Черга порожня! (Неможливо видалити елемент)");
            System.exit(1);
        }
        System.out.println("Із Черги був видалений елемент: " + queue.get(front));
        queue.remove(front);

    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Черга порожня!");
            return;
        }
        System.out.print("Стек: ");
        for (int elementArray: queue) {
            System.out.print(elementArray + " ");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enQueue(3);
        q.enQueue(6);
        q.enQueue(2);
        q.enQueue(9);

        q.printQueue();

        q.deQueue();
        q.printQueue();
        q.deQueue();
        q.printQueue();

    }

}
