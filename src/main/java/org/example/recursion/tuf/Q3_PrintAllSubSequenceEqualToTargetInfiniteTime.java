package org.example.recursion.tuf;

import java.util.ArrayList;

public class Q3_PrintAllSubSequenceEqualToTargetInfiniteTime {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 6, 7};
        int target = 8;
        ArrayList<Integer> ds = new ArrayList<>();
        printAllSubSeqWithInfinitChoose(arr, target, 0,  ds);
    }

    private static void printAllSubSeqWithInfinitChoose(int[] arr, int target, int index,  ArrayList<Integer> ds) {
        if (index >= arr.length) {
            if (target == 0) {
                System.out.println(ds);
            }
            return;
        }

        // PICK (infinite times → index stays same)
        if (arr[index] <= target) {
            ds.add(arr[index]);
            printAllSubSeqWithInfinitChoose(arr, target - arr[index], index, ds);
            ds.remove(ds.size() - 1); // backtrack
        }

        // NOT PICK
        printAllSubSeqWithInfinitChoose(arr, target, index + 1, ds);

    }
}
