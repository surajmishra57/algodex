package org.example.string.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Frequency of Characters in Alphabetical Order
 * Last Updated : 16 Oct, 2024
 * Given a string s, the task is to print the frequency of each of the characters of s in alphabetical order.
 * Example:
 * <p>
 * Input: s = "aabccccddd"
 * Output: a2b1c4d3
 * Since it is already in alphabetical order, the frequency
 * of the characters is returned for each character.
 * <p>
 * Input: s = "geeksforgeeks"
 * Output: e4f1g2k2o1r1s2
 */
public class Q16 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(x -> System.out.print(x.getKey() + x.getValue() + " "));

        System.out.println();

        Arrays.stream(s.split("")).sorted().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().forEach(x -> System.out.print(x.getKey() + x.getValue() + " "));
    }
}
