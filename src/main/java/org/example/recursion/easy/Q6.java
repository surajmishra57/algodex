package org.example.recursion.easy;

/**
 * Decimal to binary number using recursion
 * Last Updated : 17 Mar, 2025
 * Given a decimal number as input, we need to write a program to convert the given decimal number into an equivalent binary number.
 * <p>
 * Examples :
 * <p>
 * Input: d = 7
 * Output: 111
 * Explanation:  20 + 21  + 22 = 1+2+4 = 7.
 * <p>
 * Input: d = 10
 * Output: 1010
 * Explanation: 21  + 23 = 2+8 = 10.
 */
public class Q6 {
    public static void main(String[] args) {
        int input = 10;
        System.out.println(findBinaryUsingRecursion(input));
    }

    private static String findBinaryUsingRecursion(int input) {
        if (input > 1)
            return findBinaryUsingRecursion(input / 2) + (input % 2);
        return String.valueOf(input);
    }
}
