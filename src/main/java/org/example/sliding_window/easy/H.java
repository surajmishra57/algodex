package org.example.sliding_window.easy;

import java.util.*;

public class H {
    public static void main(String[] args) {
        String S = "aaza";
        System.out.println(findMirror(S));
    }

    private static int findMirror(String s) {
        int result = 0;
        int[] freq = new int[26];
        var ss = s.toCharArray();
        Arrays.sort(ss);
        s = String.valueOf(ss);
        Arrays.fill(freq, 0);
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length()/2; i++) {
            int index = (int) s.charAt(i) - 'a';
            if (freq[Math.abs(26 - index - 1)] != 0) {
                result++;
            }
        }
        return result;
    }
}
