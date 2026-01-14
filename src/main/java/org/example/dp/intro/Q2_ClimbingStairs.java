package org.example.dp.intro;
import java.util.Arrays;

/**
 *
 * Given N stair a person can only take 1,2 or 3 step at time need to fine all possible path count
 */
public class Q2_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(countPathUsingSimpleRecursion(14));
        int[] arr = new int[15];
        Arrays.fill(arr, -1);
        System.out.println(countPathUsingMomoization(14, arr));
        System.out.println(countPathUsingTabulization(14));
    }

    private static int countPathUsingTabulization(int n) {
        if (n == 0)
            return 1;
        int[] arr = new int[n + 1];
        arr[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                arr[i] = arr[i - 1];
            } else if (i == 2) {
                arr[i] = arr[i - 1] + arr[i - 2];
            } else {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }
        return arr[n];
    }

    private static int countPathUsingMomoization(int n, int[] arr) {
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;
        else if (arr[n] != -1) {
            return arr[n];
        }
//        System.out.println("Hello : " + n);
        return arr[n] = countPathUsingMomoization(n - 1, arr) + countPathUsingMomoization(n - 2, arr)
                + countPathUsingMomoization(n - 3, arr);
    }

    private static int countPathUsingSimpleRecursion(int n) {
        if (n == 0)
            return 1;
        else if (n < 0) {
            return 0;
        }

        return countPathUsingSimpleRecursion(n - 1)
                + countPathUsingSimpleRecursion(n - 2)
                + countPathUsingSimpleRecursion(n - 3);
    }

}

