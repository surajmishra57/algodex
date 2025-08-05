package org.example.linklist.medium;

import java.util.HashSet;

import static org.example.linklist.medium.Q1.showList;

/**
 * Remove Duplicates from an Unsorted Linked List
 * Last Updated : 23 Jul, 2025
 * Given an unsorted linked list containing n nodes, the task is to remove duplicate nodes while preserving the original order.
 * <p>
 * Examples:
 * <p>
 * Input: 12 -> 11 -> 12 -> 21 -> 41 -> 43 -> 21
 * Output: 12 -> 11 -> 21 -> 41 -> 43
 * Explanation: The second occurrence of 12 (the one after 11) and the second occurrence of 21 (the one at the end) are removed, resulting in a linked list that maintains the order of their first appearances.
 * <p>
 * Input: 1 -> 2 -> 3 -> 2 -> 4
 * Output: 1 -> 2 -> 3 -> 4
 * Explanation: Similarly, the second occurrence of 2 is removed, ensuring that each number appears only once while maintaining the order of their first appearances.
 */
public class Q6 {
    public static void main(String[] args) {
        Node head = new Node(12);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(21);
        head.next.next.next.next.next = new Node(41);
        head.next.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next.next = new Node(21);

        showList(head);
        removeDuplicateFromUnsortedList(head);
        System.out.println();
        showList(head);
    }

    private static void removeDuplicateFromUnsortedList(Node head) {
        Node curr = head;
        Node prev = null;
        HashSet<Integer> hashSet = new HashSet<>();
        while (curr != null) {
            if (hashSet.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                hashSet.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
    }
}
