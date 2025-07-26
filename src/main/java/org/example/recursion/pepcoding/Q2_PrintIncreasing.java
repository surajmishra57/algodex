package org.example.recursion.pepcoding;

public class Q2_PrintIncreasing {
    public static void main(String[] args) {
        printIncreasing(10);
    }

    private static void printIncreasing(int i) {
        if (i > 0) {
            printIncreasing(i - 1);
            System.out.print(i + " ");
        }
    }
}
