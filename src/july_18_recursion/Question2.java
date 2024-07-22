package july_18_recursion;

// The task is to reverse an array and print it.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 3, 5, 1};
        reverseArr(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

    static void reverseArr(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
//      self work
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        reverseArr(nums,start+1, end-1);
    }
}
