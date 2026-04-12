package DataStructuresImplementation.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeImplementation implements BinaryTree {

    Scanner sc = new Scanner(System.in);

    @Override
    public Node createTree() {
        System.out.print("Enter value - ");
        int value = sc.nextInt();

        if(value == -1)
            return null;

        Node root = new Node(value);

        System.out.print("Enter data for left of " +value+ ":");
        System.out.println();
        root.left = createTree();
        System.out.print("Enter data for right of " +value+ ":");
        System.out.println();
        root.right = createTree();

        return root;
    }

    @Override
    public void inOrder(Node root) {
        if(root==null) return;

        // left  node  right
        inOrder(root.left);
        System.out.print(root.data + "---");
        inOrder(root.right);
    }

    @Override
    public void preOrder(Node root) {
        if(root==null) return;

        //node left right
        System.out.print(root.data + "---");
        preOrder(root.left);
        preOrder(root.right);
    }

    @Override
    public void postOrder(Node root) {
        if(root==null) return;

        //left right node
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"---");
    }

    @Override
    public void levelOrderSameLine(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty())
        {
            Node current = queue.poll();
            System.out.print(current.data+"---");

            if(current.left!=null)
                queue.add(current.left);
            if(current.right!=null)
                queue.add(current.right);
        }
    }

    @Override
    public void levelOrderLevelBasedLine(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            if(current==null)
            {
                if(queue.isEmpty())
                    return;
                System.out.println();
                queue.add(null);
                continue;
            }

            System.out.print(current.data+"---");
            if(current.left!=null)
                queue.add(current.left);
            if(current.right!=null)
                queue.add(current.right);
        }
    }

    @Override
    public int heightOfBinaryTree(Node root) {
        if(root==null)
            return 0;
        return 1 + Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right));
        //1 is added for taking into account current node
    }

    @Override
    public int sizeOfBinaryTree(Node root) {
        if(root==null)
            return 0;
        return 1 + sizeOfBinaryTree(root.left)+sizeOfBinaryTree(root.right);
        //1 is added for taking into account current node
    }

    @Override
    public List<Integer> findMinMaxValue(Node root) {
        if(root==null)
            return List.of(Integer.MAX_VALUE, Integer.MIN_VALUE);

        int minValue = Math.min(root.data,
                                    Math.min(findMinMaxValue(root.left).get(0),
                                             findMinMaxValue(root.right).get(0)));
        int maxValue = Math.max(root.data,
                                Math.max(findMinMaxValue(root.left).get(1),
                                         findMinMaxValue(root.right).get(1)));

        return List.of(minValue,maxValue);
    }
}
