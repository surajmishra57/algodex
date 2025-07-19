package org.example.string.basic;

/**
 * Insert a character in String at a Given Position
 * Last Updated : 06 Nov, 2024
 * Given a string s, a character c and an integer position pos, the task is to insert the character c into the string s at the specified position pos.
 * <p>
 * Examples:
 * <p>
 * Input: s = "Geeks", c = 'A', pos = 3
 * Output: GeeAks
 * <p>
 * Input: s = "HelloWorld", c = '!', pos = 5
 * Output: Hello!World
 */
public class Q4 {
    public static void main(String[] args) {
        String s = "Geeks";
        char c = 'A';
        int pos = 3;
        System.out.println(insertCharToGivenPosition(s, c, pos));
    }

    private static String insertCharToGivenPosition(String s, char c, int pos) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == pos) {
                str.append(c);
            }
            str.append(s.charAt(i));

        }
        return String.valueOf(str);
    }
}
