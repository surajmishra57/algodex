package org.example.string.easy;

import java.util.HashMap;

/**
 * Check if two strings are k-anagrams or not
 * Last Updated : 17 Feb, 2025
 * Given two strings of lowercase alphabets and a value k, the task is to find if two strings are K-anagrams of each other or not.
 * <p>
 * Note: Two strings are called k-anagrams if the following two conditions are true.
 * <p>
 * Both have same number of characters.
 * Two strings can become anagram by changing at most k characters in a string.
 * Examples :
 * <p>
 * Input: str1 = "anagram" , str2 = "grammar" , k = 3
 * Output: Yes
 * Explanation: We can update maximum 3 values and it can be done in changing only 'r' to 'n' and 'm' to 'a' in str2.
 * <p>
 * Input: str1 = "geeks", str2 = "eggkf", k = 1
 * Output: No
 * Explanation: We can update or modify only 1 value but there is a need of modifying 2 characters. i.e. g and f in str 2.
 */
public class Q9 {
    public static void main(String[] args) {
        String str1 = "geeks", str2 = "eggkf";
        int k = 1;
        System.out.println(checkForKAanagram(str1, str2, k));
    }

    private static boolean checkForKAanagram(String str1, String str2, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map.put(String.valueOf(str1.charAt(i)), map.getOrDefault(String.valueOf(str1.charAt(i)), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(String.valueOf(str2.charAt(i)))) {
                map.put(String.valueOf(str2.charAt(i)), map.get(String.valueOf(str2.charAt(i))) - 1);
                if (map.get(String.valueOf(str2.charAt(i))) == 0)
                    map.remove(String.valueOf(str2.charAt(i)));
            }
        }
        int count = 0;
        for (String ch : map.keySet()) {
            count += map.get(ch);
        }

        if (count > k)
            return false;
        else
            return true;

    }
}
