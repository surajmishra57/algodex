package org.example.array.ep;

public class Q5 {
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6};
//        int d = 2;
        int arr[] = {1, 2, 3};
        int d = 4;
        rotateAnArray(arr, d);
        for (var data : arr) {
            System.out.print(data + " ");
        }


    }

    private static void rotateAnArray(int[] arr, int d) {
        d %= arr.length;
        rotateHelper(arr, 0, d - 1);
        rotateHelper(arr, d, arr.length - 1);
        rotateHelper(arr, 0, arr.length - 1);
    }

    private static void rotateHelper(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
