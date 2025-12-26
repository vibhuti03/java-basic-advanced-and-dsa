package DataStructuresImplementation.Queue.CircularQueue;

public class CircularQueueImplementation implements CircularQueue{

    private char[] queue;
    private int front;
    private int rear;
    private static int MAX_SIZE;

    CircularQueueImplementation(int size){
        MAX_SIZE = size;
        queue = new char[size];
        front = -1;
        rear = -1;
    }



    @Override
    public void enqueue(char element) {
        if(isFull())
            return; //OVERFLOW
        rear = nextCircularPositionOfPointer(rear,MAX_SIZE);
        queue[rear] = element;
        if(front == -1)
            front++;
    }

    @Override
    public char dequeue() {

        if(isEmpty())
            return '0'; //UNDERFLOW

        char value = queue[front];

        if (front == rear){
            //This was the last element in the queue, hence reset pointers to original
            front = rear = -1;
        }
        else {
            front = nextCircularPositionOfPointer(front,MAX_SIZE);
        }

        return value;
    }

    @Override
    public char peek() {
        if (isEmpty())
            return '0'; //UNDERFLOW
        return queue[front];
    }

    @Override
    public boolean isEmpty() {
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    @Override
    public boolean isFull() {
        if ( nextCircularPositionOfPointer(rear,MAX_SIZE) == front)
            return true;
        return false;
    }

    @Override
    public int size() {
        int size =  Math.abs(front-rear);
        if(size == 0){
            return size;
        }
        return size+1;
    }

    private int nextCircularPositionOfPointer(int currentValue,int maxValue){
        return ((currentValue+1)%maxValue);
    }
}
