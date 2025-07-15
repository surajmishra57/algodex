package org.example.recursion.easy;

/**
 * https://www.geeksforgeeks.org/dsa/recursive-function-check-string-palindrome/
 * Recursive function to check if a string is palindrome
 * Last Updated : 11 May, 2025
 * Given a string s, the task is to check if it is a palindrome or not.
 * <p>
 * Examples:
 * <p>
 * Input: s = "abba"
 * Output: Yes
 * Explanation: s is a palindrome
 * <p>
 * Input: s = "abc"
 * Output: No
 * Explanation: s is not a palindrome
 */
public class Q9 {
    public static void main(String[] args) {
        String val = "abba";
        System.out.println(isPalindrome(val, 0, val.length() - 1));
    }

    private static boolean isPalindrome(String val, int left, int right) {
        if (left >= right)
            return true;
        if (val.charAt(left) != val.charAt(right))
            return false;
        return isPalindrome(val, left + 1, right - 1);
    }
}
