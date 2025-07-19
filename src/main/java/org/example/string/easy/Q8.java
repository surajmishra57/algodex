package org.example.string.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Check if two Strings are Anagrams of each other
 * Last Updated : 30 Jun, 2025
 * Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams — i.e., if they contain the same characters with the same frequencies.
 * <p>
 * Examples:
 * <p>
 * Input: s1 = “geeks”  s2 = “kseeg”
 * Output: true
 * Explanation: Both the string have same characters with same frequency. So, they are anagrams.
 * <p>
 * Input: s1 = "allergy", s2 = "allergyy"
 * Output: false
 * Explanation: Although the characters are mostly the same, s2 contains an extra 'y' character. Since the frequency of characters differs, the strings are not anagrams.
 * <p>
 * Input: s1 = "listen", s2 = "lists"
 * Output: false
 * Explanation: The characters in the two strings are not the same — some are missing or extra. So, they are not anagrams.
 */
public class Q8 {
    public static void main(String[] args) {
        String s1 = "allergy", s2 = "allergyy";
        System.out.println(isAnagrameUsingHashMap(s1, s2));
        System.out.println(isAnagrameUsingSortin(s1.toCharArray(), s2.toCharArray()));
        System.out.println(isAnagrameUsingFrequencyArray(s1, s2));
    }

    private static boolean isAnagrameUsingFrequencyArray(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }

    private static boolean isAnagrameUsingSortin(char[] charArray, char[] charArray1) {
        if (charArray.length != charArray1.length)
            return false;
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray1[i])
                return false;
        }
        return true;
    }

    private static boolean isAnagrameUsingHashMap(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(String.valueOf(s1.charAt(i)), map.getOrDefault(String.valueOf(s1.charAt(i)), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(String.valueOf(s2.charAt(i)))) {
                map.put(String.valueOf(s2.charAt(i)), map.get(String.valueOf(s2.charAt(i))) - 1);
                if (map.get(String.valueOf(s2.charAt(i))) == 0)
                    map.remove(String.valueOf(s2.charAt(i)));
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
}
