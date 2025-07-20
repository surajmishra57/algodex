package org.example.string.easy;

/**
 * Palindrome String
 * Last Updated : 21 Sep, 2024
 * Given a string s, the task is to check if it is palindrome or not.
 * <p>
 * Example:
 * <p>
 * Input: s = "abba"
 * Output: 1
 * Explanation: s is a palindrome
 * <p>
 * Input: s = "abc"
 * Output: 0
 * Explanation: s is not a palindrome
 */
public class Q5 {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(checkforPalindromeUsingRecursion(str, 0, str.length() - 1));
        System.out.println(checkforPalindromeUsingOnePointer(str, 0));
    }

    private static boolean checkforPalindromeUsingOnePointer(String str, int left) {
        int right = str.length() - 1 - left;
        while (left < right) {
            right = str.length() - 1 - left;
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
        }
        return true;
    }

    private static boolean checkforPalindromeUsingRecursion(String str, int left, int right) {
        if (left >= right)
            return true;
        if (str.charAt(left) != str.charAt(right))
            return false;
        return checkforPalindromeUsingRecursion(str, left + 1, right - 1);
    }
}
