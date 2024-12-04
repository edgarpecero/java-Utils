package org.example;

import org.example.arrays.ArrayHigherNumber;
import org.example.arrays.ReverseArray;
import org.example.matrix.DiagonalDiff;
import org.example.matrix.MatrixOperations;
import org.example.matrix.enums.MatrixAction;
import org.example.strings.Palindrome;
import org.example.strings.ReverseString;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");

        /* MATRIX OPERATIONS */
//        MatrixOperations matrixOperations = new MatrixOperations();
//        matrixOperations.operation(MatrixAction.SUM, matrixOperations.MATRIX);


        /* STRING CHALLENGES */
//        ReverseString reverseString = new ReverseString();
//        reverseString.reversedString();
//        Palindrome palindrome = new Palindrome();
//        palindrome.start();
        DiagonalDiff.diagonalDiff();

//        /* ARRAY CHALLENGES */
//        ReverseArray reverseArray = new ReverseArray();
//        reverseArray.reverseArray();
//        ArrayHigherNumber arrayHigherNumber = new ArrayHigherNumber();
//        arrayHigherNumber.start();


    }
}