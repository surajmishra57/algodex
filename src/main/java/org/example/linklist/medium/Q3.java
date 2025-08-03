package org.example.linklist.medium;

/**
 * Find length of loop/cycle in given Linked List
 * Last Updated : 23 Jul, 2025
 * Given the head of a linked list. The task is to find the length of the loop in the linked list. If the loop is not present return 0.
 * <p>
 * Examples:
 * <p>
 * Input: head: 1  → 2  → 3  → 4  → 5  → 2
 * Output: 4
 * Explanation: There exists a loop in the linked list and the length of the loop is 4.
 */
public class Q3 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next;
        System.out.println(findLengthOfLoop(head));
    }

    private static int findLengthOfLoop(Node head) {
        int count = 0;
        Node slow = head;
        Node fast = head;
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }
        count++;
        slow = slow.next;
        while (slow != fast) {
            slow = slow.next;
            count++;
        }
        return count;
    }
}
