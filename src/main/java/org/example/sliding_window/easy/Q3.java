package org.example.sliding_window.easy;

/**
 * Check if Permutation of Pattern is Substring
 * Last Updated : 16 Jan, 2025
 * Given two strings txt and pat having lowercase letters, the task is to check if any permutation of pat is a substring of txt.
 * <p>
 * Examples:
 * <p>
 * Input: txt = "geeks", pat = "eke"
 * Output: true
 * Explanation: "eek" is a permutation of "eke" which exists in "geeks".
 * <p>
 * Input: txt = "programming", pat = "rain"
 * Output: false
 * Explanation: No permutation of "rain" exists as a substring in "programming".
 * <p>
 * Try it on GfG Practice
 */
public class Q3 {
    public static void main(String[] args) {
        String txt = "programming";
        String pat = "rain";
        System.out.println(permutationOfSubString(txt, pat));
    }

    private static boolean checkFreq(int[] freq) {
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }

    private static boolean permutationOfSubString(String txt, String pat) {
        int[] freq = new int[26];
        for (int i = 0; i < pat.length(); i++) {
            freq[txt.charAt(i) - 'a'] += 1;
            freq[pat.charAt(i) - 'a'] -= 1;
        }
        if (checkFreq(freq))
            return true;

        for (int i = pat.length(); i < txt.length(); i++) {
            freq[txt.charAt(i) - 'a'] += 1;
            freq[txt.charAt(i - pat.length()) - 'a'] -= 1;
            if (checkFreq(freq))
                return true;
        }
        return false;
    }
}
