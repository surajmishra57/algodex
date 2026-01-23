package org.example.array.ep;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {19, -10, 20, 14, 2, 16, 10};
        int data = findThirdLargsetElement(arr);
        System.out.println("Third Larget Data " + data);
    }

    private static int findThirdLargsetElement(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (var data : arr) {
            if (first < data) {
                third = second;
                second = first;
                first = data;
            } else if (second < data && data != first) {
                third = second;
                second = data;
            } else if (third < data && data != first && data != second) {
                third = data;
            }

        }
        return third;
    }
}
