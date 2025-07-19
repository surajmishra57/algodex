package org.example.string.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Program to find Smallest and Largest Word in a String
 * Last Updated : 03 Mar, 2025
 * Given a string, find the minimum and the maximum length words in it.
 * <p>
 * Examples:
 * Input : "This is a test string"
 * Output : Minimum length word: a
 * Maximum length word: string
 * Input : "GeeksforGeeks A computer Science portal for Geeks"
 * Output : Minimum length word: A
 * Maximum length word: GeeksforGeeks
 */
public class Q12 {
    public static void main(String[] args) {
        String s = "This is a test string";
        System.out.println(Arrays.stream(s.split(" "))
                .min(Comparator.comparing(String::length)).get());

        System.out.println(Arrays.stream(s.split(" "))
                .max(Comparator.comparing(String::length)).get());
    }
}
