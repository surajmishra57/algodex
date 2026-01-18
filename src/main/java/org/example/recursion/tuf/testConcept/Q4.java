package org.example.recursion.tuf.testConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Q4 {
    static public Set<ArrayList<Integer>> setData = new HashSet<>();

    public static void main(String[] args) {

        int[] arr = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        ArrayList<Integer> ds = new ArrayList<>();

        findAllSubSequenceAllWithGivenSumUniqueEle(arr, target, 0, 0, ds);
        for (var data : setData) {
            System.out.println(data);
        }
    }

    private static void findAllSubSequenceAllWithGivenSumUniqueEle(int[] arr, int target, int index, int currSum, ArrayList<Integer> ds) {
        if (index >= arr.length) {
            if (currSum == target) {
                Collections.sort(ds);
                setData.add((ArrayList<Integer>) ds.clone());
            }
            return;
        }
        ds.add(arr[index]);
        findAllSubSequenceAllWithGivenSumUniqueEle(arr, target, index + 1, currSum + arr[index], ds);
        ds.remove(ds.size() - 1);
        findAllSubSequenceAllWithGivenSumUniqueEle(arr, target, index + 1, currSum, ds);
    }
}
