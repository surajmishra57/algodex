package org.example.recursion.tuf.testConcept;

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayList<Integer> ds = new ArrayList<>();
        printAllSubSequence(arr, 0, ds);
    }

    private static void printAllSubSequence(int[] arr, int index, ArrayList<Integer> ds) {
        if (arr.length == index) {
            System.out.println(ds);
            return;
        }
        ds.add(arr[index]);
        printAllSubSequence(arr, index + 1, ds);
        ds.remove(ds.size() - 1);
        printAllSubSequence(arr, index + 1, ds);
    }
}
