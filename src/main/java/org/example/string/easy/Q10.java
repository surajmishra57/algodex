package org.example.string.easy;

import java.util.HashMap;

/**
 * Longest substring between any pair of occurrences ōf similar characters
 * Last Updated : 05 Jul, 2025
 * Given a string s, your task is to determine the length of the longest substring that lies between two identical characters in the string. The substring should exclude the characters at the two ends. If no such pair of identical characters exists, return -1.
 * <p>
 * Examples:
 * <p>
 * Input: s = "accabbacc"
 * Output: 6
 * Explanation: The matching characters are 'c' at positions 1 and 8. Substring between them is "cabbac", of length 6.
 * <p>
 * Input: s = "aa"
 * Output: 0
 * Explanation: Matching characters 'a' are at positions 0 and 1. No characters in between, so length is 0.
 * <p>
 * Input: s = "abcd"
 * Output: -1
 * Explanation: No repeated characters exist, hence no valid substring between same characters.
 */
public class Q10 {
    public static void main(String[] args) {
        String s = "accabbacc";
        System.out.println(findLongestSubstringBetweenAnyPairOfOccurrencesUsingHashMap(s));
    }

    private static int findLongestSubstringBetweenAnyPairOfOccurrencesUsingHashMap(String s) {
        int result = Integer.MIN_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(String.valueOf(s.charAt(i)))) {
                map.put(String.valueOf(s.charAt(i)), i);
            } else {
                result = Math.max(result, i - map.get(String.valueOf(s.charAt(i))) - 1);
            }
        }
        return result;
    }
}
