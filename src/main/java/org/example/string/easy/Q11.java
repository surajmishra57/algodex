package org.example.string.easy;

import java.util.ArrayList;

/**
 * Generate all binary strings from given pattern
 * Last Updated : 20 Oct, 2022
 * Given a string containing of '0', '1' and '?' wildcard characters, generate all binary strings that can be formed by replacing each wildcard character by '0' or '1'.
 * Example :
 * <p>
 * <p>
 * <p>
 * Input: str = "1??0?101"
 * Output:
 * 10000101
 * 10001101
 * 10100101
 * 10101101
 * 11000101
 * 11001101
 * 11100101
 * 11101101
 */
public class Q11 {
    public static void main(String[] args) {
        String str = "1??0?101";
        ArrayList<String> res = new ArrayList<String>();
        System.out.println(genBin(str, res));
    }

    private static ArrayList<String> genBin(String s, ArrayList<String> res) {
        if (s.indexOf('?') != -1) {
            String s1 = s.replaceFirst("\\?", "0"); // only replace once
            String s2 = s.replaceFirst("\\?", "1"); // only replace once
            genBin(s1, res);
            genBin(s2, res);
        } else res.add(s);
        return res;
    }
}
