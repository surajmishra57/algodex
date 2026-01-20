package org.example.recursion.pepcoding;

import java.util.ArrayList;

public class Q_PrintSubSequence {
    public static void main(String[] args) {
        String s = "abc";
        for (var data : printAllSubSequenceOfString(s)) {
            System.out.println(data);
        }

        System.out.println("---------------------");
        String[] arr = new String[]{"a", "b", "c"};
        ArrayList<String> ds = new ArrayList<>();
        findAllSubSeq(arr, 0, ds);

    }

    private static void findAllSubSeq(String[] arr, int i, ArrayList<String> ds) {
        if (arr.length <= i) {
            System.out.println(ds);
            return;
        }
        ds.add(arr[i]);
        findAllSubSeq(arr, i + 1, ds);
        ds.remove(ds.size() - 1);
        findAllSubSeq(arr, i + 1, ds);
    }

    private static ArrayList<String> printAllSubSequenceOfString(String s) {
        if (s.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;
        }
        char ch = s.charAt(0);
        String sub = s.substring(1);
        ArrayList<String> resp = new ArrayList<>();
        ArrayList<String> res = printAllSubSequenceOfString(sub);
        for (var data : res) {
            resp.add("_" + data);
            resp.add(ch + data);
        }

        return resp;
    }
}
