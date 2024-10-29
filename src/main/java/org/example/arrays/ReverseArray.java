package org.example.arrays;

import java.util.Arrays;

public class ReverseArray {
    private final int[] ARRAY = new int[] {1,2,3,4};
    public void reverseArray() {

        int left = 0, right = ARRAY.length -1;
        while (left < right) {
            int temp = ARRAY[left];
            ARRAY[left] = ARRAY[right];
            ARRAY[right] = temp;
            
            left++;
            right--;
        }

        System.out.println(Arrays.toString(ARRAY));
    }
}
