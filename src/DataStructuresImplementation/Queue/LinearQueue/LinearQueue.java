package DataStructuresImplementation.Queue.LinearQueue;

public interface LinearQueue {
    void enqueue(char element);

    char dequeue();

    char peek();

    boolean isEmpty();

    int size();
}
