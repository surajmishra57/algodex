package org.example.array.ep;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverseArrayUsingRecur(arr, 0, arr.length - 1);
        for (var data : arr) {
            System.out.print(data + " ");
        }
    }

    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void reverseArrayUsingRecur(int[] arr, int start, int end) {
        if (start > end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayUsingRecur(arr, start + 1, end - 1);

    }
}


