package DataStructuresImplementation.Trees.BinaryTree;

import java.util.List;

public interface BinaryTree {
    Node createTree();

    void inOrder(Node root);

    void preOrder(Node root);

    void postOrder(Node root);

    void levelOrderSameLine(Node root);

    void levelOrderLevelBasedLine(Node root);

    int heightOfBinaryTree(Node root);

    int sizeOfBinaryTree(Node root);

    List<Integer> findMinMaxValue(Node root);
}
