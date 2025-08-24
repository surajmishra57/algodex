package org.example.tree.binary_tree.easy;

import org.example.tree.binary_tree.BinaryTreeNode;

import javax.print.DocFlavor;

/**
 * Given a Binary Tree, find the maximum(or minimum) element in it. For example, maximum in the following Binary Tree is 9.
 * <p>
 * 1T
 * <p>
 * In Binary Search Tree, we can find maximum by traversing right pointers until we reach the rightmost node. But in Binary Tree, we must visit every node to figure out maximum. So the idea is to traverse the given tree and for every node return maximum of 3 values.
 * <p>
 * Node's data.
 * Maximum in node's left subtree.
 * Maximum in node's right subtree.
 * Below is the implementation of above approach.
 */
public class Q2 {

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.left.right = new BinaryTreeNode(7);
        root.right.left = new BinaryTreeNode(5);
        root.right.left.left = new BinaryTreeNode(8);
        root.right.left.right = new BinaryTreeNode(9);
        root.right.right = new BinaryTreeNode(6);
        preOrder(root);
        System.out.println();
        System.out.println(findMaxElement(root));
        System.out.println();
        System.out.println(findMinElement(root));
        System.out.println();
        System.out.println(sumOfAllNodes(root));
    }

    private static int sumOfAllNodes(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int res = root.data;
        int left = sumOfAllNodes(root.left);
        int right = sumOfAllNodes(root.right);
        res += left;
        res += right;
        return res;
    }

    private static int findMinElement(BinaryTreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;
        int res = root.data;
        int left = findMinElement(root.left);
        int right = findMinElement(root.right);
        res = Math.min(res, left);
        res = Math.min(res, right);
        return res;
    }

    private static int findMaxElement(BinaryTreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;
        int res = root.data;
        int left = findMaxElement(root.left);
        int right = findMaxElement(root.right);
        res = Math.max(left, res);
        res = Math.max(right, res);
        return res;
    }


    private static void preOrder(BinaryTreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
}
