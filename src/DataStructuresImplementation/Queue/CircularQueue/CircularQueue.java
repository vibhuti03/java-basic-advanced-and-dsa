package DataStructuresImplementation.Queue.CircularQueue;

public interface CircularQueue {
    void enqueue(char element);

    char dequeue();

    char peek();

    boolean isEmpty();

    boolean isFull();

    int size();
}
