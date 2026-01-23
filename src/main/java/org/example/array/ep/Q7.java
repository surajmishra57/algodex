package org.example.array.ep;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 1, 1};
        int data = maxConsecutiveOneAndZeroInBinaryArray(arr);
        System.out.println(data);
    }

    private static int maxConsecutiveOneAndZeroInBinaryArray(int[] arr) {
        int count = 1, maxCount = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        return Math.max(maxCount, count);
    }
}
