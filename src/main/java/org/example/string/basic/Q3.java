package org.example.string.basic;

/**
 * Program to Search a Character in a String
 * Last Updated : 25 Mar, 2025
 * Given a character ch and a string s, the task is to find the index of the first occurrence of the character in the string. If the character is not present in the string, return -1.
 * <p>
 * Examples:
 * <p>
 * Input: s = "geeksforgeeks", ch = 'k'
 * Output: 3
 * Explanation: The character 'k' is present at index 3 and 11 in "geeksforgeeks", but it first appears at index 3.
 * <p>
 * Input: s = "geeksforgeeks", ch = 'z'
 * Output: -1
 * Explanation: The character 'z' is not present in "geeksforgeeks".
 */
public class Q3 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char ch = 'k';
        System.out.println(findCharInString(s.toCharArray(), ch));
    }

    private static int findCharInString(char[] s, char ch) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ch)
                return i;

        }
        return -1;
    }
}
