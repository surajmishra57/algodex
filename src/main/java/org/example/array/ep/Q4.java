package org.example.array.ep;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        reverseArrayInGroup(arr, k);
        for (var data : arr) {
            System.out.print(data + " ");
        }
    }

    private static void reverseArrayInGroup(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            int start = i;
            int end = Math.min(arr.length - 1, i + k -1);
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
