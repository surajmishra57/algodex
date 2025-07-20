package org.example.string.easy;

/**
 * Count of substrings that start and end with 1 in given Binary String
 * Last Updated : 09 Jul, 2025
 * Given a binary string s, the task is to count all substrings that start and end with the character '1'. A valid substring must have both its first and last characters as '1', and can include one or more number of characters in between.
 * <p>
 * Examples:
 * <p>
 * Input: s = "00100101"
 * Output: 3
 * Explanation: Valid substrings are "1001", "100101", and "101", all starting and ending with '1'.
 * <p>
 * Input: s = "1001"
 * Output: 1
 * Explanation: Only one valid substring: "1001", which starts and ends with '1'.
 * <p>
 * Input: s = "111"
 * Output: 3
 * Explanation: Valid substrings are "11" (first and second), "11" (second and third), and "111" (entire string).
 */
public class Q3 {
    public static void main(String[] args) {
        String s = "00100101";
        System.out.println(countOfSubStringThatStartWithOneAndEndWithOne(s));
    }

    private static int countOfSubStringThatStartWithOneAndEndWithOne(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == '1' && s.charAt(j) == '1')
                    count++;
            }
        }
        return count;
    }
}
