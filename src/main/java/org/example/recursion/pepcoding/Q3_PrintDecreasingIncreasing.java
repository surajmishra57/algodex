package org.example.recursion.pepcoding;

public class Q3_PrintDecreasingIncreasing {
    public static void main(String[] args) {
        printFirstDecreasingAndThenIncreasingOrder(10);
    }

    private static void printFirstDecreasingAndThenIncreasingOrder(int i) {
        if (i > 0) {
            System.out.print(i + " ");
            printFirstDecreasingAndThenIncreasingOrder(i - 1);
            System.out.print(i + " ");
        }
    }
}
