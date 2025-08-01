package org.example.linklist.easy;

/**
 * Remove every k-th node of the linked list
 * Last Updated : 16 Sep, 2024
 * Given a singly linked list, the task is to remove every kth node of the linked list. Assume that k is always less than or equal to the length of the Linked List.
 * <p>
 * Examples :
 * <p>
 * Input: LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> 6, k = 2
 * Output: 1 -> 3 -> 5
 * Explanation: After removing every 2nd node of the linked list, the resultant linked list will be: 1 -> 3 -> 5 .
 * <p>
 * Input: LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10, k = 3
 * Output: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10
 * Explanation: After removing every 3rd node of the linked list, the resultant linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10.
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
        iterateNode(head);
        removeKthNode(head, 3);
        System.out.println();
        iterateNode(head);
    }

    private static void removeKthNode(Node head, int k) {
        Node temp = head;
        int i = 1;
        while (temp != null && temp.next != null) {
            i++;
            if (i % k == 0) {
                temp.next = temp.next.next;
                i++;
            }
            temp = temp.next;
        }
    }

    private static void iterateNode(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
