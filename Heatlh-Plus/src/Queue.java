/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Amna
 */
public class Queue<T> {
 private int capacity;
    private int size;
    private int front;
    private int rear;
    private T[] queue;

    // Constructor to initialize the queue with a specified capacity
    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity]; // Generic array creation
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add an element to the queue
    public void enqueue(T element) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            queue[rear] = element;
            size++;
        } else {
         //   System.out.println("Queue is full. Cannot add more elements.");
        }
    }

    // Remove and return an element from the front of the queue
    public T dequeue() {
        if (!isEmpty()) {
            T element = queue[front];
            front = (front + 1) % capacity;
            size--;
            return element;
        } else {
         //   System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
    }

    // Get an element at a specific index
    public T get(int index) {
        if (index >= 0 && index < size) {
            return queue[(front + index) % capacity];
        }
        return null;
    }

    // Return the current size of the queue
    public int size() {
        return size;
    }
}



