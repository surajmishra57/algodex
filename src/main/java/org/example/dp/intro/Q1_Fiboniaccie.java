package org.example.dp.intro;

import java.util.Arrays;

public class Q1_Fiboniaccie {
    public static void main(String[] args) {
        System.out.println(fibUsingRecurion(10));
        int[] arr = new int[11];
        Arrays.fill(arr, -1);
        System.out.println(fibUsingMemoization(10, arr));
        System.out.println(finUsingTabulization(10));
    }

    private static int finUsingTabulization(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }


    private static int fibUsingMemoization(int i, int[] arr) {
        if (i <= 1)
            return i;
        else if (arr[i] != -1) {
            return arr[i];
        }
        return arr[i] = fibUsingMemoization(i - 1, arr) + fibUsingMemoization(i - 2, arr);
    }

    private static int fibUsingRecurion(int i) {
        if (i <= 1)
            return i;
        return fibUsingRecurion(i - 1) + fibUsingRecurion(i - 2);
    }
}
