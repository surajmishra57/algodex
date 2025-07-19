package org.example.string.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * All substrings of a given String
 * Last Updated : 14 Feb, 2025
 * Given a string s, containing lowercase alphabetical characters. The task is to print all non-empty substrings of the given string.
 * <p>
 * Examples :
 * <p>
 * Input :  s = "abc"
 * Output :  "a", "ab", "abc", "b", "bc", "c"
 * <p>
 * Input :  s = "ab"
 * Output :  "a",  "ab",  "b"
 * <p>
 * Input :  s = "a"
 * Output :  "a"
 */
public class Q9 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(genrateAllSubStringUsingIterationApproch(s));
    }

    private static List<String> genrateAllSubStringUsingIterationApproch(String s) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
//                StringBuilder sb = new StringBuilder();
//                for (int k = i; k <= j; k++) {
//                    sb.append(s.charAt(k));
//                }
//                res.add(String.valueOf(sb));

                res.add(s.substring(i, j + 1));
            }
        }
        return res;
    }
}
