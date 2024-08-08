package day3;

// Return the index of given value if presented in arr using recursion.

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,4,6,7,9,11,25};
        int target = 11;
        int ans  = check(nums, 0, nums.length-1, target);
        System.out.println(ans);
    }

    public static int check(int[] nums, int s, int e, int target){
        int mid = (e-s)/2+s;
        if(s>=e){
            return -1;
        }
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
            s = mid+1;
        }
        if ((nums[mid]>target)){
            e = mid-1;
        }
        return check(nums, s, e, target);

    }
}
