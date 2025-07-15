package org.example.recursion.easy;

/**
 * https://www.geeksforgeeks.org/dsa/reverse-a-string-using-recursion/
 * Given a string, the task is to print the given string in reverse order using recursion.
 * <p>
 * Examples:
 * <p>
 * Input: s = "Geeks for Geeks"
 * Output: "skeeG rof skeeG"
 * Explanation: After reversing the input string we get "skeeG rof skeeG".
 * <p>
 * Input: s = "Reverse a string Using Recursion"
 * Output: "noisruceR gnisU gnirts a esreveR"
 * Explanation: After reversing the input string we get "noisruceR gnisU gnirts a esreveR".
 */
public class Q5 {
    public static void main(String[] args) {
        String s = "Geeks for Geeks";
        System.out.println(reverseStringUsingRecrusionSubStringMethod(s));
        System.out.println(reverseStringUsingRecrusion(s.toCharArray(), 0, s.length() - 1));
    }

    private static String reverseStringUsingRecrusionSubStringMethod(String s) {
        if (s.isEmpty())
            return s;
        return reverseStringUsingRecrusionSubStringMethod(s.substring(1)) + s.charAt(0);
    }

    private static String reverseStringUsingRecrusion(char[] s, int left, int right) {
        if (left >= right)
            return String.valueOf(s);
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        return reverseStringUsingRecrusion(s, left + 1, right - 1);
    }
}
