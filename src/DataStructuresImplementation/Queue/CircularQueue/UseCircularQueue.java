package DataStructuresImplementation.Queue.CircularQueue;

public class UseCircularQueue {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueueImplementation(4);

        System.out.println(circularQueue.size()); //0
        System.out.println(circularQueue.isEmpty());

        circularQueue.enqueue('a');
        circularQueue.enqueue('b');
        circularQueue.enqueue('c');

        System.out.println(circularQueue.isEmpty());
        System.out.println(circularQueue.size()); //3

        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());

        circularQueue.enqueue('d');
        System.out.println(circularQueue.size()); //0
        System.out.println(circularQueue.isFull()); //false
        System.out.println(circularQueue.peek()); // d
        System.out.println(circularQueue.isEmpty()); //false
        System.out.println(circularQueue.dequeue()); // d

        System.out.println(circularQueue.isEmpty()); //true

        circularQueue.enqueue('j');
        circularQueue.enqueue('k');
        circularQueue.enqueue('l');
        circularQueue.enqueue('m');

        System.out.println(circularQueue.size());
        System.out.println(circularQueue.isFull()); //true
        circularQueue.enqueue('r'); // OVERFLOW

    }
}
