package org.example.matrix;

import java.util.List;

public class DiagonalDiff {
    static final List<List<Integer>> matrix = List.of(
            List.of(11, 2, 4),
            List.of(4, 5, 6),
            List.of(10, 8, -12)
    );

    public static int diagonalDifference(List<List<Integer>> arr) {

        // Write your code here
//        int numRows = arr.size();
//        int numColumns = arr.get(0).size();
//        int left = 0;
//        int right = 0;
//        for (int i = 0; i < numRows; i ++) {
//            List<Integer> row = arr.get(i);
//
//            left += row.get(i);
//            right += row.get((numColumns - 1) - i);
//        }

        int left = 0, right = 0;
        for (int i = 0; i < arr.size(); i++) {
            left += arr.get(i).get(i);
            right += arr.get(i).get(arr.size() - 1 - i);
        }

        int result =  Math.abs(left - right);
        System.out.println(result);
        return result;
    }

    public static int diagonalDiff() {
        return diagonalDifference(matrix);
    }
}
