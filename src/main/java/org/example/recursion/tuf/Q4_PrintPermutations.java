package org.example.recursion.tuf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4_PrintPermutations {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayList<Integer> ds = new ArrayList<>();
        findAllPermutations(arr, 0, ds);
        for (var tp : result)
            System.out.println(tp);
    }

    private static void findAllPermutations(int[] arr, int i, ArrayList<Integer> ds) {
        if (arr.length <= i) {
            System.out.println(ds);
            return;
        }
        ds.add(arr[i]);
        findAllPermutations(arr, i + 1, ds);
//        findAllPermutations(arr, i + 1, ds);
        ArrayList<Integer> info = new ArrayList<>();
        info.add(i);
        for (var data : ds) {
            info.add(data);
        }
        result.add(info);
    }
}
