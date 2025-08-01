package org.example.linklist.basic;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Run {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        traverseList(head);
        System.out.println();
        traverseListUsingRecursion(head);
        System.out.println();
        System.out.println(findElementInList(head, 40));
        System.out.println(findElementInListUsingRecursion(head, 92));
        System.out.println(length(head));
        System.out.println(lengthUsingRecursion(head));
        System.out.println();
        head = insertFrontOfList(head, 12);
        System.out.println();
        insertLastOfNode(head, 13);
        System.out.println();
        insertNodeSpecificPosition(head, 1, 24);
        System.out.println();
        head = deleteNodeFromBegnning(head);
        traverseList(head);
        System.out.println();
        head = deleteNodeFromLast(head);
        traverseList(head);
        head = deleteNodeFromSpecificPosition(head, 2);
        System.out.println();
        traverseList(head);
        System.out.println();
        head = reverseLinkList(head);
        traverseList(head);
        System.out.println();
        head = reverseLinkListUsingRecursion(head);
        traverseList(head);
    }

    private static Node reverseLinkList(Node head) {
        Node prev = null, curr = null, next;
        curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;
    }

    private static Node reverseLinkListUsingRecursion(Node head) {
        if (head == null || head.next == null)
            return head;
        Node rest = reverseLinkListUsingRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    private static Node deleteNodeFromSpecificPosition(Node head, int pos) {
        Node curr = head;
        for (int i = 1; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }


    private static Node deleteNodeFromLast(Node head) {
        Node curr = head;
        while (curr.next.next != null)
            curr = curr.next;
        curr.next = null;
        return head;
    }

    private static Node deleteNodeFromBegnning(Node head) {
        return head.next;
    }

    private static void insertNodeSpecificPosition(Node head, int pos, int val) {
        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        traverseList(head);
    }

    public static void insertLastOfNode(Node node, int val) {
        Node head = node;
        Node newNode = new Node(val);
        while (node.next != null)
            node = node.next;
        node.next = newNode;
        traverseList(head);
    }

    public static Node insertFrontOfList(Node node, int val) {
        Node newNode = new Node(val);
        newNode.next = node;
        traverseList(newNode);
        return newNode;
    }

    public static int lengthUsingRecursion(Node node) {
        if (node == null)
            return 0;
        return lengthUsingRecursion(node.next) + 1;
    }

    public static int length(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public static boolean findElementInListUsingRecursion(Node node, int k) {
        if (node == null)
            return false;
        if (node.data == k)
            return true;
        return findElementInListUsingRecursion(node.next, k);
    }

    public static boolean findElementInList(Node node, int k) {
        while (node != null) {
            if (node.data == k)
                return true;
            node = node.next;
        }
        return false;
    }


    public static void traverseList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void traverseListUsingRecursion(Node node) {
        if (node == null)
            return;
        traverseListUsingRecursion(node.next);
        System.out.print(node.data + " ");

    }
}
