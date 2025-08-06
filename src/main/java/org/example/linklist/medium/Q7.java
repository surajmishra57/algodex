package org.example.linklist.medium;

import static org.example.linklist.medium.Q1.showList;

/**
 * Intersection of two Sorted Linked Lists
 * Last Updated : 23 Jul, 2025
 * Given two lists sorted in increasing order, create and return a new list representing the intersection of the two lists. The new list should be made with its own memory — the original lists should not be changed.
 * <p>
 * Example:
 * <p>
 * Input:
 * First linked list: 1->2->3->4->6
 * Second linked list be 2->4->6->8,
 * Output: 2->4->6.
 * The elements 2, 4, 6 are common in
 * both the list so they appear in the
 * intersection list.
 * <p>
 * Input:
 * First linked list: 1->2->3->4->5
 * Second linked list be 2->3->4,
 * Output: 2->3->4
 * The elements 2, 3, 4 are common in
 * both the list so they appear in the
 * intersection list.
 */
public class Q7 {
    public static void main(String[] args) {
        Node firstNode = new Node(1);
        firstNode.next = new Node(2);
        firstNode.next.next = new Node(3);
        firstNode.next.next.next = new Node(4);
        firstNode.next.next.next.next = new Node(5);

        Node secondNode = new Node(2);
        secondNode.next = new Node(4);
        secondNode.next.next = new Node(6);
        secondNode.next.next.next = new Node(8);


        Node result = intersectNode(firstNode, secondNode);
        showList(result);
    }

    private static Node intersectNode(Node firstNode, Node secondNode) {
        Node firstCurr = firstNode;
        Node secondCurr = secondNode;
        Node head = null;
        while (firstCurr != null && secondCurr != null) {
            if (firstCurr.data == secondCurr.data) {
                if (head == null) {
                    head = new Node(firstCurr.data);
                } else {
                    Node temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = new Node(firstCurr.data);
                }
                firstCurr = firstNode.next;
                secondCurr = secondNode.next;
            } else if (firstCurr.data > secondCurr.data) {
                secondCurr = secondCurr.next;
            } else {
                firstCurr = firstCurr.next;
            }
        }
        return head;
    }
}
