package org.example.tree.binary_tree.traversals;

import org.example.tree.binary_tree.BinaryTreeNode;

public class Q1 {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);


        inorderUsingRecursion(root);
        System.out.println();
        inorderUsingItreation(root);

    }

    private static void inorderUsingItreation(BinaryTreeNode root) {
    }

    private static void inorderUsingRecursion(BinaryTreeNode root) {
        if (root == null)
            return;
        inorderUsingRecursion(root.left);
        System.out.print(root.data + " ");
        inorderUsingRecursion(root.right);
    }
}
