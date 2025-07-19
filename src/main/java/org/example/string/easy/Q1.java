package org.example.string.easy;

import java.util.Arrays;

/**
 * Check for Binary String
 * Last Updated : 23 Nov, 2024
 * Given a string s, the task is to check if it is a binary string or not. A binary string is a string which only contains the characters '0' and '1'.
 * <p>
 * Examples:
 * <p>
 * Input: s = "01010101010"
 * Output: true
 * <p>
 * Input: s = "geeks101"
 * Output: false
 */
public class Q1 {
    public static void main(String[] args) {
        String s = "geeks101";
        System.out.println(!(s.replaceAll("[01]", "").length() > 0));
        System.out.println(usingSimpleIterationForZeroOne(s.toCharArray()));
    }

    private static boolean usingSimpleIterationForZeroOne(char[] s) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] != '0' && s[i] != '1')
                return false;
        }
        return true;
    }
}
