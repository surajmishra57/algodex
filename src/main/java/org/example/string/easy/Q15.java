package org.example.string.easy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find Character Frequencies in Order of Occurrence
 * Last Updated : 14 Nov, 2024
 * Given string s containing only lowercase characters, the task is to print the characters along with their frequency in the order of their occurrence and in the given format explained in the examples below.
 * <p>
 * Examples:
 * <p>
 * Input: s = "geeksforgeeks"
 * Output: g2 e4 k2 s2 f1 o1 r1
 * <p>
 * Input: str = "elephant"
 * Output: e2 l1 p1 h1 a1 n1 t1
 */
public class Q15 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .forEach(x -> System.out.print(x.getKey() + x.getValue() + " "));
    }
}
