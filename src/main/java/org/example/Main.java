package org.example;

import org.example.matrix.MatrixOperations;
import org.example.matrix.enums.MatrixAction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        MatrixOperations matrixOperations = new MatrixOperations();
        matrixOperations.operation(MatrixAction.SUM, matrixOperations.MATRIX);


//        ReverseString reverseString = new ReverseString();
//        reverseString.reversedString();

    }
}