package org.example.recursion.pepcoding;

public class Q1_PrintDecreasing {
    public static void main(String[] args) {
        printDecreasing(10);
    }

    private static void printDecreasing(int i) {
        if (i >= 0) {
            System.out.print(i + " ");
            printDecreasing(i - 1);
        }
    }


}
