package day3;

// Return all occurrences of a given target element.

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnAllOccurrences {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,3,4,3,9};
        int target = 3;
        ArrayList<Integer> list = allOccurrences(nums, target, nums.length-1);
        System.out.println(list);
    }

    public static ArrayList<Integer> allOccurrences(int[] nums,int target, int idx){
        if(idx==0){
            return new ArrayList<>();
        }
        ArrayList<Integer> ansList = allOccurrences(nums,target, idx-1);
        if(nums[idx]==target){
            ansList.add(idx);
        }
        return ansList;
    }
}
