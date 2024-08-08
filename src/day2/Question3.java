package day2;

// Insertion sort algorithm

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] nums = {5, 5, 3, 1, 6, 7};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j - 1];
                nums[j - 1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
}
