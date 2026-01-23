package org.example.array.ep;

public class Q8 {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 0, 4, 0, 5, 0};
        int[] arr = new int[]{0, 0, 10, 0, 0};
        moveAllZeroToEnd(arr);
        for (var data : arr) {
            System.out.print(data + " ");
        }
    }

    private static void moveAllZeroToEnd(int[] arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx++] = temp;
            }
        }
    }
}
