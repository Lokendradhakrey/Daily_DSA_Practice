package day2.sortingAlgo;

// Bubble sort algorithm

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] nums = {3,6,3,6,7,8,0};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums){
        for (int i=0; i<nums.length; i++){
            boolean flag = false;
            for (int j=1; j<nums.length-i; j++){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }
}
