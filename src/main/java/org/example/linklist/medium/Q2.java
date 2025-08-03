package org.example.linklist.medium;

import java.util.HashSet;

import static org.example.linklist.medium.Q1.showList;

/**
 * Detect Loop or Cycle in Linked List
 * Last Updated : 23 Jul, 2025
 * Given a singly linked list, check if the linked list has a loop (cycle) or not.
 * A loop means that the last node of the linked list is connected back to a node in the same list.
 * <p>
 * Input: head: 1 -> 3 -> 4 -> 3
 * Output: true
 */

public class Q2 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head.next;
        System.out.println(detectLoopUsingHashSet(head));
        System.out.println(floyidCycleDetection(head));
    }

    private static boolean floyidCycleDetection(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    private static boolean detectLoopUsingHashSet(Node head) {
        HashSet<Node> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
