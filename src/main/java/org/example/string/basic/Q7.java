package org.example.string.basic;

/**
 * Concatenation of Two Strings
 * Last Updated : 31 Oct, 2024
 * String concatenation is the process of joining two strings end-to-end to form a single string.
 * <p>
 * Examples
 * <p>
 * Input: s1 = “Hello”, s2 = “World”
 * Output: “HelloWorld”
 * Explanation: Joining “Hello” and “World” results in “HelloWorld”.
 * <p>
 * Input: s1 = “Good”, s2 = “Morning”
 * Output: “GoodMorning”
 * Explanation: Joining “Good” and “Morning” results in “GoodMorning”
 */
public class Q7 {
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "World";
        System.out.println(concatStringUsingBuildInMethod(s1.toCharArray(), s2.toCharArray()));
    }

    private static String concatStringUsingBuildInMethod(char[] s1, char[] s2) {
        char[] str = new char[s1.length + s2.length];
        int i = 0;
        for (int j = 0; j < s1.length; j++) {
            str[i++] = s1[j];
        }
        for (int j = 0; j < s2.length; j++) {
            str[i++] = s2[j];
        }
        return String.valueOf(str);
    }
}
