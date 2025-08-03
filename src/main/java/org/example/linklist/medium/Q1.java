package org.example.linklist.medium;

/**
 * Pairwise Swap Elements of a given Linked List
 * Last Updated : 23 Jul, 2025
 * Given a singly linked list, the task is to swap linked list elements pairwise.
 * <p>
 * Examples:
 * <p>
 * Input : 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL
 * Output : 2 -> 1 -> 4 -> 3 -> 6 -> 5 -> NULL
 * <p>
 * Reverse-a-Linked-List-in-groups-of-given-size-1
 * <p>
 * <p>
 * <p>
 * Input : 1 -> 2 -> 3 -> 4 -> 5 -> NULL
 * Output : 2 -> 1 -> 4 -> 3 -> 5 -> NULL
 */

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        swapPairWise(head);
        showList(head);


    }

    public static void showList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static void swapPairWise(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            int temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
    }
}
