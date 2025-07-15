package org.example.recursion.easy;

/**
 * Print 1 to n without using loops
 * Last Updated : 17 Mar, 2025
 * You are given an integer n. Print numbers from 1 to n without the help of loops.
 * <p>
 * Examples:
 * <p>
 * Input: N = 5
 * Output: 1 2 3 4 5
 * Explanation: We have to print numbers from 1 to 5.
 * <p>
 * Input: N = 10
 * Output: 1 2 3 4 5 6 7 8 9 10
 * Explanation: We have to print numbers from 1 to 10.
 */
public class Q2 {
    public static void main(String[] args) {
        int n = 15;
        printOneToN(n);
    }

    private static void printOneToN(int n) {
        if (n > 0) {
            printOneToN(n - 1);
            System.out.print(n + " ");
        }


    }
}
