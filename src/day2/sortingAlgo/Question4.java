package day2.sortingAlgo;

// Given an integer array nums,
// move all 0's to the end of it while maintaining the relative order of the non-zero elements.

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 0, 2, 8, 0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] == 0 && nums[j] != 0) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
