package org.example.string.basic;

/**
 * Length of a String
 * Last Updated : 04 Jun, 2025
 * Given a string s, the task is to find the length of the string.
 * <p>
 * Examples:
 * <p>
 * Input: s = "abc"
 * Output:  3
 * <p>
 * Input: s = "GeeksforGeeks"
 * Output: 13
 * <p>
 * Input: s = ""
 * Output: 0
 */
public class Q1 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(lengthOfString(s));
    }

    private static int lengthOfString(String s) {
        int count = 0;
        for (var c : s.toCharArray()) {
            count++;
        }
        return count;
    }
}
