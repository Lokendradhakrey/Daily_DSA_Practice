package day3;

// Return index of second-largest element in arr. Do it using recursion.

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {2,4,6,0,2,4,11,5};
        int ans  = check(nums, 0, Integer.MIN_VALUE,Integer.MIN_VALUE);
        System.out.println(ans);
    }

    public static int check(int[] nums, int idx, int secondLargestEle, int largestEle){
        if(nums.length<=1){
            return -1;
        }
        if(idx==nums.length-1){
            return secondLargestEle;
        }

        int current = nums[idx];
        if (current > largestEle) {
            secondLargestEle = largestEle;
            largestEle = current;
        } else if (current > secondLargestEle && current != largestEle) {
            secondLargestEle = current;
        }
        return check(nums, idx+1, secondLargestEle, largestEle);
    }
}
