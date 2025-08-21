package org.example.tree.binary_tree.easy;

import org.example.tree.binary_tree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class Q1 {
    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(1);
        tree.left = new BinaryTreeNode(2);
        tree.right = new BinaryTreeNode(3);
        tree.left.left = new BinaryTreeNode(4);
        tree.left.right = new BinaryTreeNode(5);
        tree.right.left = new BinaryTreeNode(6);
        tree.right.right = new BinaryTreeNode(7);
        levelOrderTraverse(tree);
        System.out.println("");
        System.out.println(getSizeOfTree(tree));
    }

    public static int getSizeOfTree(BinaryTreeNode node) {
        if (node == null)
            return 0;
        return getSizeOfTree(node.left) + getSizeOfTree(node.right) + 1;
    }

    public static void levelOrderTraverse(BinaryTreeNode tree) {
        if (tree == null)
            return;
        Queue<BinaryTreeNode> bs = new LinkedList<>();
        bs.offer(tree);
        while (!bs.isEmpty()) {
            BinaryTreeNode node = bs.poll();
            System.out.print(node.data + " ");
            if (node.left != null)
                bs.add(node.left);
            if (node.right != null)
                bs.add(node.right);

        }
    }
}
