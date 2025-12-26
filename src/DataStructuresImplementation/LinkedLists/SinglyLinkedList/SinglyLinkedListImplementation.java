package DataStructuresImplementation.LinkedLists.SinglyLinkedList;

class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedListImplementation implements SinglyLinkedList {
    Node head;
    SinglyLinkedListImplementation(Node head){
        this.head =  head;
    }

    @Override
    public int search(Object valueToSearch) {
        Node current = head;
        int foundAt = 1;
        while(current!=null){
            if(current.data == valueToSearch){
                return foundAt;
            }
            foundAt++;
            current = current.next;
        }
        return -1;
    }

    @Override
    public void insert(Object dataToInsert, int positionToInsertAt) {
        Node newNode = new Node(dataToInsert);
        if(positionToInsertAt == 1){ //insert before head
            newNode.next = head;
            head = newNode;
        }

        Node previous = head;
        for(int i=1; i<positionToInsertAt-1;i++){
            previous = previous.next;
        }
        newNode.next = previous.next;
        previous.next = newNode;
    }

    @Override
    public Node delete(int positionToDeleteAt) {
        Object value;
        if(positionToDeleteAt == 1){ //delete first node or the head node
            value = head.data;
            head = head.next;
            return head;
        }

        //any other position
        Node previous = head;
        for(int i=1; i<positionToDeleteAt-1;i++){
            previous = previous.next;
        }
        value = previous.data;
        previous.next = previous.next.next;
        return head;
    }
}
