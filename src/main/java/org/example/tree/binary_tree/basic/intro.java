package org.example.tree.binary_tree.basic;

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class intro {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.print("PreOrder : ");
        printPreOrder(root);
        System.out.println(" ");
        System.out.print("InOrder : ");
        printInOrder(root);
        System.out.println(" ");
        System.out.print("PostOrder : ");
        printPostOrder(root);
        System.out.println(" ");
        System.out.print("LevelOrder : ");
        printLevelOrder(root);
        insertNewNode(root, 7);

        System.out.println(" ");
        printLevelOrder(root);
        System.out.println();
        printPreOrder(root);

        System.out.println("");
        System.out.println("");
        System.out.println(searchKey(root, 60));


    }

    private static void insertNewNode(Node root, int data) {
        if (root == null)
            root.left = new Node(data);

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            } else if (node.left == null) {
                node.left = new Node(data);
            } else if (node.right != null) {
                queue.offer(node.right);
            } else if (node.right == null) {
                node.right = new Node(data);
            }
        }
    }

    private static List<List<Integer>> printLevelOrder(Node root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        int level = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return null;
    }

    private static void printPostOrder(Node root) {
        if (root == null)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static void printInOrder(Node root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

    private static void printPreOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private static boolean searchKey(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        boolean dLeft = searchKey(root.left, key);
        if (dLeft)
            return true;
        boolean dRight = searchKey(root.right, key);
        return dRight;

    }

}
