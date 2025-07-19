package org.example.string.easy;

/**
 * Check if one string is subsequence of other
 * Last Updated : 10 Feb, 2025
 * Given two strings s1 and s2, find if the first string is a Subsequence of the second string, i.e. if s1 is a subsequence of s2.  A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.
 * <p>
 * Examples :
 * <p>
 * Input: s1 = "AXY", s2 = "ADXCPY"
 * Output: True
 * All characters of s1 are in s2 in the same order
 * <p>
 * Input: s1 = "AXY", s2 = "YADXCP"
 * Output: False
 * All characters are present, but order is not same.
 * <p>
 * Input: s1 = "gksrek", s2 = "geeksforgeeks"
 * Output: True
 */
public class Q7 {
    public static void main(String[] args) {
        String s1 = "AXY";
        String s2 = "ADXCPY";
        System.out.println(basicRegexApproch(s1, s2));
        System.out.println(usingSimpleIteration(s1, s2));
        System.out.println(usingRecurison(s1, s2, 0, 0));

    }

    private static boolean usingRecurison(String s1, String s2, int count, int index) {
        if (count == s1.length())
            return true;
        else if (index >= s2.length()) {
            return false;
        }
        if (count < s1.length() && s2.charAt(index) == s1.charAt(count)) {
            count++;
        }
        return usingRecurison(s1, s2, count, index + 1);
    }

    private static boolean usingSimpleIteration(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (count < s1.length() && s2.charAt(i) == s1.charAt(count)) {
                count++;
            }
        }
        if (count == s1.length())
            return true;
        return false;

    }

    private static boolean basicRegexApproch(String s1, String s2) {
        return s2.replaceAll("[^AXY]", "").equals(s1);
    }
}
