package org.example.array.ep;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 7, 8, 9, 10};
        sortArrayInWaveForm(arr);
        for (var data : arr) {
            System.out.print(data + " ");
        }
    }

    private static void sortArrayInWaveForm(int[] arr) {
        for (int i = 0; i < arr.length-1; i += 2) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }


}
