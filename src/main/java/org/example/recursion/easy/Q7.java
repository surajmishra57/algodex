package org.example.recursion.easy;

/**
 * https://www.geeksforgeeks.org/dsa/sum-digit-number-using-recursion/
 * Sum of digit of a number using recursion
 * Last Updated : 17 Mar, 2025
 * Given a number, we need to find sum of its digits using recursion.
 * <p>
 * Examples:
 * <p>
 * Input: 12345
 * Output: 15
 * Explanation: Sum of digits → 1 + 2 + 3 + 4 + 5 = 15
 * <p>
 * Input: 45632
 * Output: 20
 */
public class Q7 {
    public static void main(String[] args) {
        int input = 45632;
        System.out.println(sumOfAllDigitsUsingRecursion(input, 0));
    }

    private static int sumOfAllDigitsUsingRecursion(int input, int sum) {
        if (input == 0)
            return sum;
        return sumOfAllDigitsUsingRecursion(input / 10, sum + (input % 10));
    }
}
