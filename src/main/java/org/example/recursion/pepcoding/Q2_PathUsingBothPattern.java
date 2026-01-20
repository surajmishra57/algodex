package org.example.recursion.pepcoding;


import java.util.ArrayList;

public class Q2_PathUsingBothPattern {
    public static void main(String[] args) {
        int stair = 2;
        ArrayList<String> result = getAllPossibleWay(stair);
        for (var data : result) {
            System.out.println(data);
        }

        System.out.println("-===================-");
        printAllPossibleWay(2, "");
    }

    private static void printAllPossibleWay(int stair, String str) {
        if (stair == 0) {
            System.out.println(str);
            return;
        }

        if (stair < 0)
            return;
        printAllPossibleWay(stair - 1, 1 + str);
        printAllPossibleWay(stair - 2, 2 + str);
        printAllPossibleWay(stair - 3, 3 + str);
    }

    private static ArrayList<String> getAllPossibleWay(int stair) {
        if (stair == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add("");
            return result;

        }
        if (stair < 0) {
            return new ArrayList<>();
        }

        ArrayList<String> path1 = getAllPossibleWay(stair - 1);
        ArrayList<String> path2 = getAllPossibleWay(stair - 2);
        ArrayList<String> path3 = getAllPossibleWay(stair - 3);

        ArrayList<String> result = new ArrayList<>();
        for (var data : path1) {
            result.add(1 + data);
        }
        for (var data : path2) {
            result.add(2 + data);
        }
        for (var data : path3) {
            result.add(3 + data);
        }
        return result;
    }
}
