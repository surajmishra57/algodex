package org.example.string.easy;

/**
 * Check if a string is substring of another
 * Last Updated : 11 Jul, 2025
 * Given two strings txt and pat, the task is to find if pat is a substring of txt. If yes, return the index of the first occurrence, else return -1.
 * <p>
 * Examples :
 * <p>
 * Input: txt = "geeksforgeeks", pat = "eks"
 * Output: 2
 * Explanation: String "eks" is present at index 2 and 9, so 2 is the smallest index.
 * <p>
 * Input: txt = "geeksforgeeks", pat = "xyz"
 * Output: -1.
 * Explanation: There is no occurrence of "xyz" in "geeksforgeeks"
 */
public class Q6 {
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "xyz";
        System.out.println(findSubStringUsingNestedLoop(txt, pat));

    }

    private static int findSubStringUsingNestedLoop(String txt, String pat) {
        for (int i = 0; i < txt.length(); i++) {
            int j = 0;
            for (; j < pat.length(); j++) {
                if (txt.charAt(i + j) != pat.charAt(j))
                    break;
            }
            if (j == pat.length())
                return i;

        }
        return -1;
    }
}
