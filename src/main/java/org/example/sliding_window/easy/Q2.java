package org.example.sliding_window.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Smallest window containing 0, 1 and 2
 * Last Updated : 10 Mar, 2025
 * Given a string S of size N consisting of the characters 0, 1 and 2, the task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.
 * <p>
 * Examples:
 * <p>
 * Input: S = "01212"
 * Output: 3
 * Explanation: The substring 012 is the smallest substring that contains the characters 0, 1 and 2.
 * <p>
 * Input:  S = "12121"
 * Output: -1
 * Explanation:  As the character 0 is not present in the string S, therefore no substring containing all the three characters 0, 1 and 2 exists. Hence, the answer is -1 in this case.
 */
public class Q2 {
    public static void main(String[] args) {
        String s = "001122012210";
        System.out.println(smallestWindowContaining012(s));
    }

    private static int smallestWindowContaining012(String s) {
        int result = Integer.MAX_VALUE;
        int right = 0, left = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            if (s.charAt(right) == '0' || s.charAt(right) == '1' || s.charAt(right) == '2') {
                map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            }
            while (map.size() == 3 && left < right) {
                result = Math.min(result, right - left + 1);
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                if (map.get(s.charAt(left)) == 0)
                    map.remove(s.charAt(left));
                left++;
            }
            right++;
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
