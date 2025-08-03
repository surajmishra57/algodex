package org.example.linklist.medium;

import static org.example.linklist.medium.Q1.showList;

/**
 * Remove duplicates from a sorted linked list
 * Last Updated : 26 Mar, 2025
 * Given a linked list sorted in non-decreasing order. Return the list by deleting the duplicate nodes from the list. The returned list should also be in non-decreasing order.
 * <p>
 * Example:
 * <p>
 * Input : Linked List = 11->11->11->21->43->43->60
 * Output : 11->21->43->60
 */
public class Q5 {
    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(43);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(60);
        showList(head);
        removeLinkList(head);
        System.out.println();
        showList(head);

    }

    private static void removeLinkList(Node head) {
        Node curr = head;
        while (curr.next != null && curr.next.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }

        }
    }
}
