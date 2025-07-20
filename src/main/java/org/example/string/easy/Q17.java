package org.example.string.easy;

/**
 * URLify a given string (Replace spaces with %20)
 * Last Updated : 24 Apr, 2025
 * Given a string s, the task is to replace all the spaces in the string with '%20'.
 * <p>
 * Examples:
 * <p>
 * Input: s = "i love programming"
 * Output: "i%20love%20programming"
 * Explanation: The 2 spaces are replaced by '%20'
 * <p>
 * Input: s = "ab cd"
 * Output: "ab%20cd"
 */
public class Q17 {
    public static void main(String[] args) {
        String s = "i love programming";
        System.out.println(s.replaceAll(" ", "%20"));
        System.out.println(usingIterationMethod(s.toCharArray()));
    }

    private static String usingIterationMethod(char[] charArray) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 32)
                s.append("%20");
            else
                s.append(charArray[i]);
        }
        return String.valueOf(s);
    }
}
