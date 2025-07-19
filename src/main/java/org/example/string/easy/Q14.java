package org.example.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Print all possible strings that can be made by placing spaces
 * Last Updated : 14 Feb, 2023
 * Given a string you need to print all possible strings that can be made by placing spaces (zero or one) in between them.
 * <p>
 * Input:  str[] = "ABC"
 * Output: ABC
 * AB C
 * A BC
 * A B C
 * Source: Amazon Interview Experience | Set 158, Round 1, Q 1.
 * <p>
 * The idea is to use recursion and create a buffer that one by one contains all output strings having spaces. We keep updating the buffer in every recursive call. If the length of the given string is ‘n’ our updated string can have a maximum length of n + (n-1) i.e. 2n-1. So we create a buffer size of 2n (one extra character for string termination).
 * We leave 1st character as it is, starting from the 2nd character, we can either fill a space or a character. Thus, one can write a recursive function like below.
 * <p>
 * Below is the implementation of the above approach:
 */
public class Q14 {
    public static void main(String[] args) {
        String s = "ABC";
        for (var x : spaceString(s)) {
            System.out.println(x);
        }
    }

    private static ArrayList<String> spaceString(String s) {
        ArrayList<String> str = new ArrayList<>();
        if (s.length() == 1) {
            str.add(s);
            return str;
        }
        ArrayList<String> strTemp = spaceString(s.substring(1, s.length()));
        for (int i = 0; i < strTemp.size(); i++) {
            str.add(s.charAt(0) + strTemp.get(i));
            str.add(s.charAt(0) + " " + strTemp.get(i));
        }
        return str;
    }
}
