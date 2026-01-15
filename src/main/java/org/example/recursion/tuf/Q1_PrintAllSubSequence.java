package org.example.recursion.tuf;

import java.util.ArrayList;

public class Q1_PrintAllSubSequence {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2};
        ArrayList<Integer> ds = new ArrayList<>();
        printAllSubSeq(arr, 0, ds);
    }

    private static void printAllSubSeq(int[] arr, int n, ArrayList<Integer> ds) {
        if (n >= arr.length) {
            for (var data : ds)
                System.out.print(data + " ");
            System.out.println("");
            return;
        }
        ds.add(arr[n]);
        printAllSubSeq(arr, n + 1, ds);
        ds.remove(ds.size()-1);
        printAllSubSeq(arr, n + 1, ds);

    }
}
