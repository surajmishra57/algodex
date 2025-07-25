package org.example.sliding_window.medium;

import java.util.HashSet;

/**
 * Longest Substring Without Repeating Characters
 * Last Updated : 20 Mar, 2025
 * Given a string s having lowercase characters, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Input: s = "geeksforgeeks"
 * Output: 7
 * Explanation: The longest substrings without repeating characters are "eksforg” and "ksforge", with lengths of 7.
 * <p>
 * Input: s = "aaa"
 * Output: 1
 * Explanation: The longest substring without repeating characters is "a"
 * <p>
 * Input: s = "abcdefabcbb"
 * Output: 6
 * Explanation: The longest substring without repeating characters is "abcdef".
 */
public class Q1 {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(findLongestSubStringWithoutRepeatingCharacters(s));
    }

    private static int findLongestSubStringWithoutRepeatingCharacters(String s) {
        int result = Integer.MIN_VALUE;
        int right = 0, left = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
}
