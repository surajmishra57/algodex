package org.example.recursion.tuf.testConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int target = 7;

        findAllSubSeqWithEqualSum(arr, target, 0, 0, new ArrayList<Integer>());
        int count = countAllSubSeqWithEqualSum(arr, target, 0, 0);
        System.out.println("count of subseq with sum " + count);
        System.out.println("print all subsequence");
        printAllSubSequenceOfArray(arr, 0, new ArrayList<String>());
    }

    private static void printAllSubSequenceOfArray(int[] arr, int i, ArrayList<String> strings) {
        if (arr.length <= i) {
            System.out.println(strings);
            return;
        }
        strings.add(arr[i] + "");
        printAllSubSequenceOfArray(arr, i + 1, strings);
        strings.remove(strings.size() - 1);
        printAllSubSequenceOfArray(arr, i + 1, strings);
    }

    private static int countAllSubSeqWithEqualSum(int[] arr, int target, int index, int currSum) {
        if (index >= arr.length) {
            if (currSum == target)
                return 1;
            return 0;
        }
        return countAllSubSeqWithEqualSum(arr, target, index + 1, currSum + arr[index])
                + countAllSubSeqWithEqualSum(arr, target, index + 1, currSum);
    }

    private static void findAllSubSeqWithEqualSum(int[] arr, int target, int index, int currSUm, ArrayList<Integer> ds) {
        if (index >= arr.length) {
            if (currSUm == target) {
                System.out.println(ds);
            }
            return;
        }
        ds.add(arr[index]);
        findAllSubSeqWithEqualSum(arr, target, index + 1, currSUm + arr[index], ds);
        ds.remove(ds.size() - 1);
        findAllSubSeqWithEqualSum(arr, target, index + 1, currSUm, ds);
    }

}
