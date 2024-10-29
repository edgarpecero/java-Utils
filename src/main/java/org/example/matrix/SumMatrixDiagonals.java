package org.example.matrix;

import org.example.strings.ReverseString;

import java.util.Scanner;

public class SumMatrixDiagonals {

    public void iteration() {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for( int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "-");
            }
        }
    }

    private void printMatrixValues(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for( int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "-");
            }
        }
    }

    public void exe(){
        // Enter a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, first line of numbers:");
        String userInput = scanner.nextLine();

        scanner.close();
    }
}
