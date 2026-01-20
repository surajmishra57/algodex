package org.example.dp.gfg.basic;

import java.util.Map;

public class Q6_WeightClimeStair {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(findMinimumCost(arr));
    }

    private static int findMinimumCost(int[] arr) {
        int n = arr.length;
        int first = findMinHelper(arr, n - 1);
        int second = findMinHelper(arr, n - 2);
        return Math.min(first, second);
    }

    private static int findMinHelper(int[] arr, int i) {
        if (i == 0 || i == 1)
            return arr[i];
        int first = findMinHelper(arr, i - 1);
        int second = findMinHelper(arr, i - 2);
        return arr[i] + Math.min(first, second);
    }
}
