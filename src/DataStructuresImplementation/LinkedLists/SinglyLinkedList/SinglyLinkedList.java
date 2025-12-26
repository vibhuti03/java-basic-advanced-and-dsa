package DataStructuresImplementation.LinkedLists.SinglyLinkedList;

public interface SinglyLinkedList<T> {
    int search(T valueToSearch);

    void insert(T dataToInsert, int positionToInsertAt);

    Node delete(int positionToDeleteAt);
}
