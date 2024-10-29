package org.example.matrix;

import org.example.matrix.enums.MatrixAction;

import java.util.Scanner;

public class MatrixOperations {

    public final int[][] MATRIX = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    public void operation(MatrixAction action, int[][] matrix) {
        int result = 0;
        switch (action) {
            case SUM:
                result = sumMatrix(MATRIX);
                break;
            case PRODUCT:
                result = productMatrix(MATRIX);
                break;
            case MAX:
                result = maxMatrix(MATRIX);
                break;
            case MIN:
                result = minMatrix(MATRIX);
                break;
            default:
                throw new UnsupportedOperationException("Not supported operation.");
        }
        System.out.printf("Result for %s is: %s%n", action, result);
    }

    private void printMatrixValues(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for( int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + "-");
            }
        }
    }

    private int sumMatrix(int[][] matrix){
        int sum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for( int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//            }
//        }
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    private int productMatrix(int[][] matrix) {
        int product = 1;
        for (int[] row : matrix) {
            for (int value : row) {
                product *= value;
            }
        }
        return product;
    }

    private int maxMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private int minMatrix(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    private int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }
}
