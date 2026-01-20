package org.example.recursion.pepcoding;

import java.util.ArrayList;

public class Q1_PrintSubSequenceUsingBothPattern {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> res = getAllSubSequence(s);
        for (var info : res) {
            System.out.println(info);
        }

        System.out.println("===============================");
        printAllSubSequenceOfGivenString(s, "");
    }

    private static void printAllSubSequenceOfGivenString(String s, String prefix) {
        if (s.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        char ch = s.charAt(0);
        String pre = s.substring(1);
        printAllSubSequenceOfGivenString(pre, prefix + ch);
        printAllSubSequenceOfGivenString(pre, prefix + "_");

    }


    private static ArrayList<String> getAllSubSequence(String s) {
        if (s.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        char ch = s.charAt(0);
        String subSeq = s.substring(1);
        ArrayList<String> res = getAllSubSequence(subSeq);
        ArrayList<String> mainResult = new ArrayList<>();
        for (var data : res) {
            mainResult.add(data + "_");
            mainResult.add(data + ch);
        }
        return mainResult;
    }
}
