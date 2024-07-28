package day2.sortingAlgo;

// Selection sort algorithm

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 7, 6, 1, 0};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = 1 + i; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
}
