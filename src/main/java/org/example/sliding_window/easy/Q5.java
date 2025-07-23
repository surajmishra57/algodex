package org.example.sliding_window.easy;

/**
 * Remove all consecutive duplicates from a string
 * Last Updated : 11 May, 2025
 * Given a string s , The task is to remove all the consecutive duplicate characters of the string and return the resultant string.
 * <p>
 * Examples:
 * <p>
 * Input: s = "aaaaabbbbbb"
 * Output: ab
 * Explanation: Remove consecutive duplicate characters from a string s  such as 5 a's are at consecative so only write a and same like that in b's condition.
 * <p>
 * Input: s = "geeksforgeeks"
 * Output: geksforgeks
 * Explanation: Remove consecutive duplicate characters from a string s such as ee are their hence remove one e.
 * <p>
 * Input: s = "aabccba"
 * Output: abcba
 * Explanation: In this 2 a's are at consecutive so 1 a's remove after that 2 c's are consecutive so one c remove .
 */
public class Q5 {
    public static void main(String[] args) {
        String s = "aaaaabbbbbb";
        System.out.println(removeDuplicateUsingRecusion(s));
    }

    private static String removeDuplicateUsingRecusion(String s) {
        if (s.length() <= 1)
            return s;
        if (s.charAt(0) == s.charAt(1))
            return removeDuplicateUsingRecusion(s.substring(1));
        else
            return s.charAt(0) + removeDuplicateUsingRecusion(s.substring(1));
    }
}
