package org.example.recursion.easy;

/**
 * https://www.geeksforgeeks.org/dsa/print-n-to-1-without-loop/
 * Print n to 1 without loop
 * Last Updated : 05 Jul, 2025
 * You are given an integer n. Print numbers from n to 1 without the help of loops.
 * <p>
 * Examples:
 * <p>
 * Input: n = 5
 * Output: 5 4 3 2 1
 * Explanation: We have to print numbers from 5 to 1.
 * <p>
 * Input: n = 10
 * Output: 10 9 8 7 6 5 4 3 2 1
 * Explanation: We have to print numbers from 10 to 1.
 */
public class Q3 {
    public static void main(String[] args) {
        int n = 10;
        printN_To_One(n);
    }

    private static void printN_To_One(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printN_To_One(n - 1);
        }
    }
}
