package org.example.string.easy;

/**
 * Check if given String is Pangram or not
 * Last Updated : 27 Mar, 2025
 * Given a string s, the task is to check if it is Pangram or not.
 * A pangram is a sentence containing all letters of the English Alphabet.
 * <p>
 * Examples:
 * <p>
 * Input: s = "The quick brown fox jumps over the lazy dog"
 * Output: true
 * Explanation: The input string contains all characters from ‘a’ to ‘z’.
 * <p>
 * Input: s = "The quick brown fox jumps over the dog"
 * Output: false
 * Explanation: The input string does not contain all characters from ‘a’ to ‘z’, as ‘l’, ‘z’, ‘y’ are missing
 * <p>
 * Try it on GfG Practice
 */
public class Q4 {
    public static void main(String[] args) {
        String st = "The quick brown fox jumps over the lazy dog";
        System.out.println(checkIfPangramOrNot(st));
    }

    private static boolean checkIfPangramOrNot(String st) {
        st = st.toLowerCase().replace(" ", "");
        int[] freq = new int[26];
        for (int i = 0; i < st.length(); i++) {
            freq[st.charAt(i) - 'a']++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0)
                return false;
        }
        return true;
    }
}
