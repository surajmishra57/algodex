package org.example.string.easy;

/**
 * Camel case of a given sentence
 * Last Updated : 23 Nov, 2024
 * Given a sentence having lowercase characters, the task is to convert it to Camel Case. In Camel Case, words are joined without spaces, the first word keeps its original case, and each subsequent word starts with an uppercase letter.
 * <p>
 * Examples:
 * <p>
 * Input: "i got intern at geeksforgeeks"
 * Output: "iGotInternAtGeeksforgeeks"
 * <p>
 * Input: "here comes the garden"
 * Output: "hereComesTheGarden"
 */
public class Q2 {
    public static void main(String[] args) {
        String st = "i got intern at geeksforgeeks";
        System.out.println(camelCaseConvert(st));
    }

    private static String  camelCaseConvert(String st) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            if (i!=0 && st.charAt(i - 1) == 32)
                s.append(String.valueOf(st.charAt(i)).toUpperCase());
            else
                s.append(st.charAt(i) == 32 ? "" :String.valueOf(st.charAt(i)));
        }
        return String.valueOf(s);
    }
}
