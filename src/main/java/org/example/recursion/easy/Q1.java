package org.example.recursion.easy;

/**
 * https://www.geeksforgeeks.org/dsa/program-for-factorial-of-a-number/
 * Factorial of a Number
 * Last Updated : 13 Nov, 2024
 * Given the number n (n >=0), find its factorial. Factorial of n is defined as 1 x 2 x ... x n. For n = 0, factorial is 1. We are going to discuss iterative and recursive programs in this post.
 * <p>
 * Examples:
 * <p>
 * Input: n = 5
 * Output: 120
 * Explanation: 5! = 5 * 4 * 3 * 2 * 1 = 120
 * <p>
 * Input: n = 4
 * Output: 24
 * Explanation: 4! = 4 * 3 * 2 * 1 = 24
 * <p>
 * Input: n = 0
 * Output: 1
 * <p>
 * Input: n = 1
 * Output: 1
 */
public class Q1 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(findTheFactorialOfN(n));
    }

    private static int findTheFactorialOfN(int i) {
        if (i == 0)
            return 1;
        return i * findTheFactorialOfN(i - 1);
    }
}
