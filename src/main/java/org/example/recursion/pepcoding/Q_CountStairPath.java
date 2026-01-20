package org.example.recursion.pepcoding;

import java.util.ArrayList;

public class Q_CountStairPath {
    public static void main(String[] args) {
//        int arr[] = new int[]{1, 2, 3};
//        int step = 3;
//        System.out.println(countOfAllPath(arr, step));

        ArrayList<Integer> ds = new ArrayList<>();
        for (var sd : printOfAllPath(3)) {
            System.out.println(sd);
        }

    }

    private static ArrayList<String> printOfAllPath(int step) {
        if (step == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        if (step < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }


        ArrayList<String> path1 = printOfAllPath(step - 1);
        ArrayList<String> path2 = printOfAllPath(step - 2);
        ArrayList<String> path3 = printOfAllPath(step - 3);

        ArrayList<String> paths = new ArrayList<>();
        for (var path : path1) {
            paths.add(1 + path);
        }
        for (var path : path2) {
            paths.add(2 + path);
        }
        for (var path : path3) {
            paths.add(3 + path);
        }
        return paths;
    }


    private static int countOfAllPath(int[] arr, int step) {
        if (step == 0)
            return 1;
        if (step < 0)
            return 0;
        int step1 = countOfAllPath(arr, step - 1);
        int step2 = countOfAllPath(arr, step - 2);
        int step3 = countOfAllPath(arr, step - 3);
        return step1 + step2 + step3;


    }
}
