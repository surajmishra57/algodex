package org.example.searching.medium;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://www.geeksforgeeks.org/dsa/find-the-k-most-frequent-words-from-a-file/
 * Given a book of words and an integer K. Assume you have enough main memory to accommodate all words. Design a dynamic data structure to find the top K most frequent words in a book. The structure should allow new words to be added in main memory.
 * <p>
 * Examples:
 * <p>
 * Input: fileData = "Welcome to the world of Geeks. This portal has been created to provide well written well thought and well explained solutions for selected questions If you like Geeks for Geeks and would like to contribute here is your chance You can write article and mail your article to contribute at geeksforgeeks org See your article appearing on the Geeks for Geeks main page and help thousands of other Geeks"
 * Output:
 * "your" : 3
 * "well" : 3
 * "and" : 4
 * "to" : 4
 * "Geeks" : 6
 */
public class Q8 {
    public static void main(String[] args) {
        String fileData = "Welcome to the world of Geeks. This portal has been created to provide well written well thought and well explained solutions for selected questions If you like Geeks for Geeks and would like to contribute here is your chance You can write article and mail your article to contribute at geeksforgeeks org See your article appearing on the Geeks for Geeks main page and help thousands of other Geeks";
        System.out.println(findingK_Most_Frequent_words(fileData, 5));
    }

    private static List<Map.Entry<String, Long>> findingK_Most_Frequent_words(String fileData, int k) {
        return Arrays.stream(fileData.toLowerCase().split("\\W+")) // split on non-word characters
                .filter(s -> !s.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .collect(Collectors.toList());

    }
}
