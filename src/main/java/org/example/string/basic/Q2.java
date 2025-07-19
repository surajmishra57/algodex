package org.example.string.basic;

/**
 * Check if two strings are same or not
 * Last Updated : 03 Mar, 2025
 * Given two strings, the task is to check if these two strings are identical(same) or not. Consider case sensitivity.
 * <p>
 * Examples:
 * <p>
 * Input: s1 = "abc", s2 = "abc"
 * Output: Yes
 * <p>
 * Input: s1 = "", s2 = ""
 * Output: Yes
 * <p>
 * Input: s1 = "GeeksforGeeks", s2 = "Geeks"
 * Output: No
 */
public class Q2 {
    public static void main(String[] args) {
        String s1 = "GeeksforGeeks", s2 = "GeeksforGeesk";
        System.out.println(isBothStringSame(s1.toCharArray(), s2.toCharArray()));
    }

    private static boolean isBothStringSame(char[] charArray, char[] charArray1) {
        if (charArray.length != charArray1.length)
            return false;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray1[i])
                return false;
        }
        return true;
    }
}
