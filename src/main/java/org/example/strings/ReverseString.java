package org.example.strings;

import java.util.Scanner;

public class ReverseString {

    private String reverse(String str) {
        char[] charArr = str.toCharArray();
        String newStr = "";

        for (int i = charArr.length - 1; i >= 0; i--) {
            newStr += charArr[i];
        }

        System.out.printf("Reversed string: %s%n", newStr);
        return newStr;
    }

    public void reversedString() {
        // Enter a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a word:");
        String userInput = scanner.nextLine();

        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(userInput));

        scanner.close();
    }

}
