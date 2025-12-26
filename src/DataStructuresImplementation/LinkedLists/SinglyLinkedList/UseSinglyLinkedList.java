package DataStructuresImplementation.LinkedLists.SinglyLinkedList;

public class UseSinglyLinkedList {
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("Hello");
        Node<String> n2 = new Node<>("Beautiful");
        Node<String> n3 = new Node<>("World");

        Node head = n1;
        n1.next = n2;
        n2.next = n3;

        SinglyLinkedList singlyLinkedList = new SinglyLinkedListImplementation(head);

        System.out.println(head.data + "----" + head.next.data + "----" + head.next.next.data );

        System.out.println(singlyLinkedList.search("Beautiful"));

        singlyLinkedList.insert("This", 2);
        System.out.println(head.data + "----" + head.next.data + "----" + head.next.next.data + "----" + head.next.next.next.data);


        head = singlyLinkedList.delete(1);
        System.out.println(head.data + "----" + head.next.data + "----" + head.next.next.data);// + "----" + head.next.next.next.data);
    }
}
