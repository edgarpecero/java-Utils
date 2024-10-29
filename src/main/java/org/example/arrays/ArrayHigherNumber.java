package org.example.arrays;

import java.util.Scanner;

public class ArrayHigherNumber {
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num  : arr) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); // Read the number of elements

        int[] arr = new int[n]; // Create an array of the specified size

        // Loop to get user input for each element in the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt(); // Read each element from user input
        }

        // Call the findMax method and print the result
        int max = findMax(arr);
        System.out.println("The maximum number is: " + max);

        scanner.close(); // Close the scanner
    }
}
