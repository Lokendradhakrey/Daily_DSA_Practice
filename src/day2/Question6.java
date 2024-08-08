package day2;

// Merge sort algorithm

import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 6, 8, 0};
        int n = nums.length;
        mergeSort(nums, 0, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void mergeSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, mid, r);
    }

    static void merge(int[] nums, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) left[i] = nums[i + l];
        for (j = 0; j < n2; j++) right[j] = nums[mid + 1 + j];
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }
        while (i < n1) {
            nums[k++] = left[i++];
        }
        while (j < n2) {
            nums[k++] = right[j++];
        }
    }
}
