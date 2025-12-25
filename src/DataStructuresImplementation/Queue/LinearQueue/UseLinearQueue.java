package DataStructuresImplementation.Queue.LinearQueue;

public class UseLinearQueue {
    public static void main(String[] args) {
        LinearQueue ourQueue = new LinearQueueImplementation(4);

        System.out.println(ourQueue.size());

        ourQueue.enqueue('a');
        ourQueue.enqueue('b');
        ourQueue.enqueue('c');
        ourQueue.enqueue('d');

        System.out.println(ourQueue.peek());
        System.out.println(ourQueue.size());

        System.out.println(ourQueue.dequeue());
        System.out.println(ourQueue.dequeue());
        System.out.println(ourQueue.dequeue());
        System.out.println(ourQueue.dequeue());

        System.out.println(ourQueue.size());
                                  /*^^^^This is where linear queue fails,i.e.,
                                   even though we have removed all elements in the queue,
                                   the size still comes as queue as though full
                                   hence causing a mismatch and any further dequeue/peek operations to fail
                                   */
//        System.out.println(ourQueue.peek());
    }
}
