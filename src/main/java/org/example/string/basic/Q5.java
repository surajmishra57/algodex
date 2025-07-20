package org.example.string.basic;

/**
 * Remove a Character from a Given Position
 * Last Updated : 13 Jun, 2025
 * Given a string and a position (0-based indexing), remove the character at the given position.
 * <p>
 * Examples:
 * <p>
 * Input : s = "abcde",  pos = 1
 * Output : s = "acde"
 * <p>
 * Input : s = "a",  pos = 0
 * Output : s = ""
 */
public class Q5 {
    public static void main(String[] args) {
        String st = "abcde";
        int pos = 1;
        System.out.println(removeCharForPos(st, pos));
    }

    private static String removeCharForPos(String st, int pos) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            if (i != pos) {
                str.append(st.charAt(i));
            }
        }
        return String.valueOf(str);
    }

}
