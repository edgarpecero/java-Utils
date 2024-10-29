package org.example.strings;

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void start() {
        // Enter a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a word:");
        String userInput = scanner.nextLine();

        boolean result = isPalindrome(userInput);
        System.out.printf("Is Palindrome? %s%n", result);

        scanner.close();
    }
}
