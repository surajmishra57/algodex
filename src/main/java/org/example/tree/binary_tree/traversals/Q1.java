package org.example.tree.binary_tree.traversals;

import org.example.tree.binary_tree.BinaryTreeNode;

import java.util.Stack;

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
        System.out.println();
        preorderUsingRecursion(root);
        System.out.println();
        preorderUsingIteration(root);
    }

    private static void preorderUsingIteration(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode curr = stack.pop();
            System.out.print(curr.data + " ");
            if (curr != null && curr.right != null)
                stack.push(curr.right);
            if (curr != null && curr.left != null)
                stack.push(curr.left);
        }
    }

    private static void preorderUsingRecursion(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorderUsingRecursion(root.left);
        preorderUsingRecursion(root.right);
    }

    private static void inorderUsingItreation(BinaryTreeNode root) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    private static void inorderUsingRecursion(BinaryTreeNode root) {
        if (root == null)
            return;
        inorderUsingRecursion(root.left);
        System.out.print(root.data + " ");
        inorderUsingRecursion(root.right);
    }
}
