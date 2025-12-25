package DataStructuresImplementation.Queue.LinearQueue;

public class LinearQueueImplementation implements LinearQueue{

    private char[] queue;
    private int front;
    private int rear;
    private static int MAX_SIZE;

    LinearQueueImplementation(int size){
        MAX_SIZE = size;
        queue = new char[size];
        front = 0;
        rear = -1;
    }

    @Override
    public void enqueue(char element) {
        if (rear == MAX_SIZE-1){
            return;
        }
        rear++;
        queue[rear] = element;
    }

    @Override
    public char dequeue() {
        if (isEmpty()){
            return '0';
        }
        /*
        char value = queue[front];
        front++;
        return value;
         */
        return queue[front++];
    }

    @Override
    public char peek() {
        if (isEmpty()){
            return '0';
        }
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        if (rear == -1)
            return true;
        return false;
    }

    @Override
    public int size() {
        return rear+1;
    }
}
