package day3;

// Check if the given arr is sorted in increasing order using recursion only.

public class IsArrSorted {
    public static void main(String[] args) {
        int[] nums = {2,4,6,7,2,7,8,3,4};
        boolean ans  = check(nums, 1);
        System.out.println(ans);
    }

    public static boolean check(int[] arr, int idx){
        if(arr.length<=1){
            return true;
        }

        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx-1]>arr[idx]) return false;
        return check(arr, idx+1);
    }
}
