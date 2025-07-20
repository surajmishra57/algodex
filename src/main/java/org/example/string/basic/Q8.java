package org.example.string.basic;

import java.util.Stack;

/**
 * Given a string s, the task is to reverse the string. Reversing a string means rearranging the characters such that the first character becomes the last, the second character becomes second last and so on.
 * <p>
 * Examples:
 * <p>
 * Input: s = "GeeksforGeeks"
 * Output: "skeeGrofskeeG"
 * Explanation : The first character G moves to last position, the second character e moves to second-last and so on.
 * <p>
 * Input: s = "abdcfe"
 * Output: "efcdba"
 * Explanation: The first character a moves to last position, the second character b moves to second-last and so on.
 */
public class Q8 {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        System.out.println(reverseStringUsingRecursion(s));
        System.out.println(reverseStringUsingTowPointer(s.toCharArray(), 0, s.length() - 1));
        System.out.println(reverseStringUsingStack(s.toCharArray()));
    }

    private static String reverseStringUsingStack(char[] charArray) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            stack.push(charArray[i]);
        }
        int count = 0;
        while (!stack.isEmpty()) {
            charArray[count++] = stack.pop();
        }
        return String.valueOf(charArray);
    }

    private static String reverseStringUsingTowPointer(char[] charArray, int left, int right) {
        while (left <= right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(charArray);
    }

    private static String reverseStringUsingRecursion(String s) {
        if (s.isEmpty())
            return s;
        return reverseStringUsingRecursion(s.substring(1)) + s.charAt(0);
    }
}
