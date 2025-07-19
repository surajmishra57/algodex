package org.example.string.basic;

/**
 * Remove all occurrences of a character in a string
 * Last Updated : 17 Oct, 2024
 * Given a string and a character, remove all the occurrences of the character in the string.
 * <p>
 * Examples:
 * <p>
 * Input : s = "geeksforgeeks"
 * c = 'e'
 * Output : s = "gksforgks"
 * <p>
 * Input : s = "geeksforgeeks"
 * c = 'g'
 * Output : s = "eeksforeeks"
 * <p>
 * Input : s = "geeksforgeeks"
 * c = 'k'
 * Output : s = "geesforgees"
 */
public class Q6 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char c = 'e';
        System.out.println(removeAllOccurrenceOfGivenChar(s.toCharArray(), c));
        System.out.println(removeAllOccurrenceOfGivenCharUsingStringBuilder(s, c));
        System.out.println(s.replaceAll("e", ""));
    }

    private static String removeAllOccurrenceOfGivenCharUsingStringBuilder(String s, char c) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                str.append(s.charAt(i));
            }
        }
        return String.valueOf(str);
    }

    private static String removeAllOccurrenceOfGivenChar(char[] s, char c) {
        int index = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != c)
                s[index++] = s[i];
        }
        return String.valueOf(s);
    }
}
